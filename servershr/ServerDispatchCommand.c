/*
Copyright (c) 2017, Massachusetts Institute of Technology All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:

Redistributions of source code must retain the above copyright notice, this
list of conditions and the following disclaimer.

Redistributions in binary form must reproduce the above copyright notice, this
list of conditions and the following disclaimer in the documentation and/or
other materials provided with the distribution.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
/*------------------------------------------------------------------------------

                Name:   SERVER$DISPATCH_COMMAND

                Type:   C function

                Author:	TOM FREDIAN

                Date:   17-APR-1992

                Purpose: Dispatch a mdsdcl command to a server

------------------------------------------------------------------------------

        Call sequence:

int SERVER$DISPATCH_COMMAND(int efn, struct dsc$descriptor *server, struct
dsc$descriptor *cli, struct dsc$descriptor *command, void (*ast)(), int astprm,
int *netid, void (*link_down)(), void (*before_ast)())

------------------------------------------------------------------------------
   Copyright (c) 1992
   Property of Massachusetts Institute of Technology, Cambridge MA 02139.
   This program cannot be copied or distributed in any form for non-MIT
   use without specific written approval of MIT Plasma Fusion Center
   Management.
---------------------------------------------------------------------------

        Description:

------------------------------------------------------------------------------*/

#include <ipdesc.h>
#include <servershr.h>
#include "servershrp.h"

EXPORT int ServerDispatchCommand(int *id, char *server, char *cli,
                                 char *command, void (*ast)(), void *astprm,
                                 int *retstatus, pthread_rwlock_t *lock,
                                 void (*before_ast)())
{
  struct descrip p1, p2;
  return ServerSendMessage(id, server, SrvCommand, retstatus, lock, NULL, ast,
                           astprm, before_ast, 2,
                           MakeDescrip(&p1, DTYPE_CSTRING, 0, 0, cli),
                           MakeDescrip(&p2, DTYPE_CSTRING, 0, 0, command));
}
