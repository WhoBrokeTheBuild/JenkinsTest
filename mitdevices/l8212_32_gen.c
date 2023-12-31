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
#include "mitdevices_msg.h"
#include "mds_gendevice.h"
#include "l8212_32_gen.h"
EXPORT int l8212_32__add(struct descriptor *name_d_ptr, struct descriptor *dummy_d_ptr __attribute__ ((unused)), int *nid_ptr)
{
  static DESCRIPTOR(library_d, "MIT$DEVICES");
  static DESCRIPTOR(model_d, "L8212_32");
  static DESCRIPTOR_CONGLOM(conglom_d, &library_d, &model_d, 0, 0);
  int usage = TreeUSAGE_DEVICE;
  int curr_nid, old_nid, head_nid, status;
  long int flags = NciM_WRITE_ONCE;
  NCI_ITM flag_itm[] = { {2, NciSET_FLAGS, 0, 0}, {0, 0, 0, 0} };
  char *name_ptr = strncpy(malloc(name_d_ptr->length + 1), name_d_ptr->pointer, name_d_ptr->length);
  flag_itm[0].pointer = (unsigned char *)&flags;
  name_ptr[name_d_ptr->length] = 0;
  status = TreeStartConglomerate(L8212_32_K_CONG_NODES);
  if (STATUS_NOT_OK)
    return status;
  status = TreeAddNode(name_ptr, &head_nid, usage);
  if (STATUS_NOT_OK)
    return status;
  *nid_ptr = head_nid;
  status = TreeSetNci(head_nid, flag_itm);
  status = TreePutRecord(head_nid, (struct descriptor *)&conglom_d, 0);
  if (STATUS_NOT_OK)
    return status;
  status = TreeGetDefaultNid(&old_nid);
  if (STATUS_NOT_OK)
    return status;
  status = TreeSetDefaultNid(head_nid);
  if (STATUS_NOT_OK)
    return status;
 ADD_NODE(:NAME, TreeUSAGE_TEXT)
 ADD_NODE(:COMMENT, TreeUSAGE_TEXT)
#define expr " 5.0	"
 ADD_NODE_EXPR(:FREQ, TreeUSAGE_NUMERIC)
#undef expr
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(:EXT_CLOCK_IN, TreeUSAGE_AXIS)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
#define expr " 0.	"
 ADD_NODE_EXPR(:STOP_TRIG, TreeUSAGE_NUMERIC)
#undef expr
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE_INTEGER(:MEMORIES, 1, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE_STRING(:HEADER, "99999943219", TreeUSAGE_TEXT)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
#define expr " 0BU	"
 ADD_NODE_EXPR(:PTS, TreeUSAGE_NUMERIC)
#undef expr
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
#define expr " 4BU	"
 ADD_NODE_EXPR(:NOC, TreeUSAGE_NUMERIC)
#undef expr
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE_INTEGER(:OFFSET, -2048, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE_ACTION(:INIT_ACTION, INIT, INIT, 50, 0, 0, CAMAC_SERVER, 0)
 ADD_NODE_ACTION(:STORE_ACTION, STORE, STORE, 50, 0, 0, CAMAC_SERVER, 0)
 ADD_NODE(:INPUT_01, TreeUSAGE_SIGNAL)
      flags |= NciM_WRITE_ONCE;
  flags |= NciM_COMPRESS_ON_PUT;
  flags |= NciM_NO_WRITE_MODEL;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_01:STARTIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_01:ENDIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(:INPUT_02, TreeUSAGE_SIGNAL)
      flags |= NciM_WRITE_ONCE;
  flags |= NciM_COMPRESS_ON_PUT;
  flags |= NciM_NO_WRITE_MODEL;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_02:STARTIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_02:ENDIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(:INPUT_03, TreeUSAGE_SIGNAL)
      flags |= NciM_WRITE_ONCE;
  flags |= NciM_COMPRESS_ON_PUT;
  flags |= NciM_NO_WRITE_MODEL;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_03:STARTIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_03:ENDIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(:INPUT_04, TreeUSAGE_SIGNAL)
      flags |= NciM_WRITE_ONCE;
  flags |= NciM_COMPRESS_ON_PUT;
  flags |= NciM_NO_WRITE_MODEL;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_04:STARTIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_04:ENDIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(:INPUT_05, TreeUSAGE_SIGNAL)
      flags |= NciM_WRITE_ONCE;
  flags |= NciM_COMPRESS_ON_PUT;
  flags |= NciM_NO_WRITE_MODEL;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_05:STARTIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_05:ENDIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(:INPUT_06, TreeUSAGE_SIGNAL)
      flags |= NciM_WRITE_ONCE;
  flags |= NciM_COMPRESS_ON_PUT;
  flags |= NciM_NO_WRITE_MODEL;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_06:STARTIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_06:ENDIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(:INPUT_07, TreeUSAGE_SIGNAL)
      flags |= NciM_WRITE_ONCE;
  flags |= NciM_COMPRESS_ON_PUT;
  flags |= NciM_NO_WRITE_MODEL;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_07:STARTIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_07:ENDIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(:INPUT_08, TreeUSAGE_SIGNAL)
      flags |= NciM_WRITE_ONCE;
  flags |= NciM_COMPRESS_ON_PUT;
  flags |= NciM_NO_WRITE_MODEL;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_08:STARTIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_08:ENDIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(:INPUT_09, TreeUSAGE_SIGNAL)
      flags |= NciM_WRITE_ONCE;
  flags |= NciM_COMPRESS_ON_PUT;
  flags |= NciM_NO_WRITE_MODEL;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_09:STARTIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_09:ENDIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(:INPUT_10, TreeUSAGE_SIGNAL)
      flags |= NciM_WRITE_ONCE;
  flags |= NciM_COMPRESS_ON_PUT;
  flags |= NciM_NO_WRITE_MODEL;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_10:STARTIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_10:ENDIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(:INPUT_11, TreeUSAGE_SIGNAL)
      flags |= NciM_WRITE_ONCE;
  flags |= NciM_COMPRESS_ON_PUT;
  flags |= NciM_NO_WRITE_MODEL;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_11:STARTIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_11:ENDIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(:INPUT_12, TreeUSAGE_SIGNAL)
      flags |= NciM_WRITE_ONCE;
  flags |= NciM_COMPRESS_ON_PUT;
  flags |= NciM_NO_WRITE_MODEL;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_12:STARTIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_12:ENDIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(:INPUT_13, TreeUSAGE_SIGNAL)
      flags |= NciM_WRITE_ONCE;
  flags |= NciM_COMPRESS_ON_PUT;
  flags |= NciM_NO_WRITE_MODEL;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_13:STARTIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_13:ENDIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(:INPUT_14, TreeUSAGE_SIGNAL)
      flags |= NciM_WRITE_ONCE;
  flags |= NciM_COMPRESS_ON_PUT;
  flags |= NciM_NO_WRITE_MODEL;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_14:STARTIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_14:ENDIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(:INPUT_15, TreeUSAGE_SIGNAL)
      flags |= NciM_WRITE_ONCE;
  flags |= NciM_COMPRESS_ON_PUT;
  flags |= NciM_NO_WRITE_MODEL;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_15:STARTIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_15:ENDIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(:INPUT_16, TreeUSAGE_SIGNAL)
      flags |= NciM_WRITE_ONCE;
  flags |= NciM_COMPRESS_ON_PUT;
  flags |= NciM_NO_WRITE_MODEL;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_16:STARTIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_16:ENDIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(:INPUT_17, TreeUSAGE_SIGNAL)
      flags |= NciM_WRITE_ONCE;
  flags |= NciM_COMPRESS_ON_PUT;
  flags |= NciM_NO_WRITE_MODEL;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_17:STARTIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_17:ENDIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(:INPUT_18, TreeUSAGE_SIGNAL)
      flags |= NciM_WRITE_ONCE;
  flags |= NciM_COMPRESS_ON_PUT;
  flags |= NciM_NO_WRITE_MODEL;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_18:STARTIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_18:ENDIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(:INPUT_19, TreeUSAGE_SIGNAL)
      flags |= NciM_WRITE_ONCE;
  flags |= NciM_COMPRESS_ON_PUT;
  flags |= NciM_NO_WRITE_MODEL;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_19:STARTIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_19:ENDIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(:INPUT_20, TreeUSAGE_SIGNAL)
      flags |= NciM_WRITE_ONCE;
  flags |= NciM_COMPRESS_ON_PUT;
  flags |= NciM_NO_WRITE_MODEL;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_20:STARTIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_20:ENDIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(:INPUT_21, TreeUSAGE_SIGNAL)
      flags |= NciM_WRITE_ONCE;
  flags |= NciM_COMPRESS_ON_PUT;
  flags |= NciM_NO_WRITE_MODEL;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_21:STARTIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_21:ENDIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(:INPUT_22, TreeUSAGE_SIGNAL)
      flags |= NciM_WRITE_ONCE;
  flags |= NciM_COMPRESS_ON_PUT;
  flags |= NciM_NO_WRITE_MODEL;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_22:STARTIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_22:ENDIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(:INPUT_23, TreeUSAGE_SIGNAL)
      flags |= NciM_WRITE_ONCE;
  flags |= NciM_COMPRESS_ON_PUT;
  flags |= NciM_NO_WRITE_MODEL;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_23:STARTIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_23:ENDIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(:INPUT_24, TreeUSAGE_SIGNAL)
      flags |= NciM_WRITE_ONCE;
  flags |= NciM_COMPRESS_ON_PUT;
  flags |= NciM_NO_WRITE_MODEL;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_24:STARTIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_24:ENDIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(:INPUT_25, TreeUSAGE_SIGNAL)
      flags |= NciM_WRITE_ONCE;
  flags |= NciM_COMPRESS_ON_PUT;
  flags |= NciM_NO_WRITE_MODEL;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_25:STARTIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_25:ENDIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(:INPUT_26, TreeUSAGE_SIGNAL)
      flags |= NciM_WRITE_ONCE;
  flags |= NciM_COMPRESS_ON_PUT;
  flags |= NciM_NO_WRITE_MODEL;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_26:STARTIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_26:ENDIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(:INPUT_27, TreeUSAGE_SIGNAL)
      flags |= NciM_WRITE_ONCE;
  flags |= NciM_COMPRESS_ON_PUT;
  flags |= NciM_NO_WRITE_MODEL;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_27:STARTIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_27:ENDIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(:INPUT_28, TreeUSAGE_SIGNAL)
      flags |= NciM_WRITE_ONCE;
  flags |= NciM_COMPRESS_ON_PUT;
  flags |= NciM_NO_WRITE_MODEL;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_28:STARTIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_28:ENDIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(:INPUT_29, TreeUSAGE_SIGNAL)
      flags |= NciM_WRITE_ONCE;
  flags |= NciM_COMPRESS_ON_PUT;
  flags |= NciM_NO_WRITE_MODEL;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_29:STARTIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_29:ENDIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(:INPUT_30, TreeUSAGE_SIGNAL)
      flags |= NciM_WRITE_ONCE;
  flags |= NciM_COMPRESS_ON_PUT;
  flags |= NciM_NO_WRITE_MODEL;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_30:STARTIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_30:ENDIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(:INPUT_31, TreeUSAGE_SIGNAL)
      flags |= NciM_WRITE_ONCE;
  flags |= NciM_COMPRESS_ON_PUT;
  flags |= NciM_NO_WRITE_MODEL;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_31:STARTIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_31:ENDIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(:INPUT_32, TreeUSAGE_SIGNAL)
      flags |= NciM_WRITE_ONCE;
  flags |= NciM_COMPRESS_ON_PUT;
  flags |= NciM_NO_WRITE_MODEL;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_32:STARTIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
 ADD_NODE(INPUT_32:ENDIDX, TreeUSAGE_NUMERIC)
      flags |= NciM_NO_WRITE_SHOT;
  status = TreeSetNci(curr_nid, flag_itm);
  status = TreeEndConglomerate();
  if (STATUS_NOT_OK)
    return status;
  return (TreeSetDefaultNid(old_nid));
}

EXPORT int l8212_32__part_name(struct descriptor *nid_d_ptr __attribute__ ((unused)), struct descriptor *method_d_ptr __attribute__ ((unused)),
			struct descriptor_d *out_d)
{
  int element = 0, status;
  NCI_ITM nci_list[] = { {4, NciCONGLOMERATE_ELT, 0, 0}, {0, 0, 0, 0} };
  nci_list[0].pointer = (unsigned char *)&element;
  status = TreeGetNci(*(int *)nid_d_ptr->pointer, nci_list);
  if (STATUS_NOT_OK)
    return status;
  switch (element) {
  case (L8212_32_N_HEAD + 1):
    StrFree1Dx(out_d);
    break;
  case (L8212_32_N_NAME + 1):
 COPY_PART_NAME(:NAME) break;
  case (L8212_32_N_COMMENT + 1):
 COPY_PART_NAME(:COMMENT) break;
  case (L8212_32_N_FREQ + 1):
 COPY_PART_NAME(:FREQ) break;
  case (L8212_32_N_EXT_CLOCK_IN + 1):
 COPY_PART_NAME(:EXT_CLOCK_IN) break;
  case (L8212_32_N_STOP_TRIG + 1):
 COPY_PART_NAME(:STOP_TRIG) break;
  case (L8212_32_N_MEMORIES + 1):
 COPY_PART_NAME(:MEMORIES) break;
  case (L8212_32_N_HEADER + 1):
 COPY_PART_NAME(:HEADER) break;
  case (L8212_32_N_PTS + 1):
 COPY_PART_NAME(:PTS) break;
  case (L8212_32_N_NOC + 1):
 COPY_PART_NAME(:NOC) break;
  case (L8212_32_N_OFFSET + 1):
 COPY_PART_NAME(:OFFSET) break;
  case (L8212_32_N_INIT_ACTION + 1):
 COPY_PART_NAME(:INIT_ACTION) break;
  case (L8212_32_N_STORE_ACTION + 1):
 COPY_PART_NAME(:STORE_ACTION) break;
  case (L8212_32_N_INPUT_01 + 1):
 COPY_PART_NAME(:INPUT_01) break;
  case (L8212_32_N_INPUT_01_STARTIDX + 1):
 COPY_PART_NAME(INPUT_01:STARTIDX) break;
  case (L8212_32_N_INPUT_01_ENDIDX + 1):
 COPY_PART_NAME(INPUT_01:ENDIDX) break;
  case (L8212_32_N_INPUT_02 + 1):
 COPY_PART_NAME(:INPUT_02) break;
  case (L8212_32_N_INPUT_02_STARTIDX + 1):
 COPY_PART_NAME(INPUT_02:STARTIDX) break;
  case (L8212_32_N_INPUT_02_ENDIDX + 1):
 COPY_PART_NAME(INPUT_02:ENDIDX) break;
  case (L8212_32_N_INPUT_03 + 1):
 COPY_PART_NAME(:INPUT_03) break;
  case (L8212_32_N_INPUT_03_STARTIDX + 1):
 COPY_PART_NAME(INPUT_03:STARTIDX) break;
  case (L8212_32_N_INPUT_03_ENDIDX + 1):
 COPY_PART_NAME(INPUT_03:ENDIDX) break;
  case (L8212_32_N_INPUT_04 + 1):
 COPY_PART_NAME(:INPUT_04) break;
  case (L8212_32_N_INPUT_04_STARTIDX + 1):
 COPY_PART_NAME(INPUT_04:STARTIDX) break;
  case (L8212_32_N_INPUT_04_ENDIDX + 1):
 COPY_PART_NAME(INPUT_04:ENDIDX) break;
  case (L8212_32_N_INPUT_05 + 1):
 COPY_PART_NAME(:INPUT_05) break;
  case (L8212_32_N_INPUT_05_STARTIDX + 1):
 COPY_PART_NAME(INPUT_05:STARTIDX) break;
  case (L8212_32_N_INPUT_05_ENDIDX + 1):
 COPY_PART_NAME(INPUT_05:ENDIDX) break;
  case (L8212_32_N_INPUT_06 + 1):
 COPY_PART_NAME(:INPUT_06) break;
  case (L8212_32_N_INPUT_06_STARTIDX + 1):
 COPY_PART_NAME(INPUT_06:STARTIDX) break;
  case (L8212_32_N_INPUT_06_ENDIDX + 1):
 COPY_PART_NAME(INPUT_06:ENDIDX) break;
  case (L8212_32_N_INPUT_07 + 1):
 COPY_PART_NAME(:INPUT_07) break;
  case (L8212_32_N_INPUT_07_STARTIDX + 1):
 COPY_PART_NAME(INPUT_07:STARTIDX) break;
  case (L8212_32_N_INPUT_07_ENDIDX + 1):
 COPY_PART_NAME(INPUT_07:ENDIDX) break;
  case (L8212_32_N_INPUT_08 + 1):
 COPY_PART_NAME(:INPUT_08) break;
  case (L8212_32_N_INPUT_08_STARTIDX + 1):
 COPY_PART_NAME(INPUT_08:STARTIDX) break;
  case (L8212_32_N_INPUT_08_ENDIDX + 1):
 COPY_PART_NAME(INPUT_08:ENDIDX) break;
  case (L8212_32_N_INPUT_09 + 1):
 COPY_PART_NAME(:INPUT_09) break;
  case (L8212_32_N_INPUT_09_STARTIDX + 1):
 COPY_PART_NAME(INPUT_09:STARTIDX) break;
  case (L8212_32_N_INPUT_09_ENDIDX + 1):
 COPY_PART_NAME(INPUT_09:ENDIDX) break;
  case (L8212_32_N_INPUT_10 + 1):
 COPY_PART_NAME(:INPUT_10) break;
  case (L8212_32_N_INPUT_10_STARTIDX + 1):
 COPY_PART_NAME(INPUT_10:STARTIDX) break;
  case (L8212_32_N_INPUT_10_ENDIDX + 1):
 COPY_PART_NAME(INPUT_10:ENDIDX) break;
  case (L8212_32_N_INPUT_11 + 1):
 COPY_PART_NAME(:INPUT_11) break;
  case (L8212_32_N_INPUT_11_STARTIDX + 1):
 COPY_PART_NAME(INPUT_11:STARTIDX) break;
  case (L8212_32_N_INPUT_11_ENDIDX + 1):
 COPY_PART_NAME(INPUT_11:ENDIDX) break;
  case (L8212_32_N_INPUT_12 + 1):
 COPY_PART_NAME(:INPUT_12) break;
  case (L8212_32_N_INPUT_12_STARTIDX + 1):
 COPY_PART_NAME(INPUT_12:STARTIDX) break;
  case (L8212_32_N_INPUT_12_ENDIDX + 1):
 COPY_PART_NAME(INPUT_12:ENDIDX) break;
  case (L8212_32_N_INPUT_13 + 1):
 COPY_PART_NAME(:INPUT_13) break;
  case (L8212_32_N_INPUT_13_STARTIDX + 1):
 COPY_PART_NAME(INPUT_13:STARTIDX) break;
  case (L8212_32_N_INPUT_13_ENDIDX + 1):
 COPY_PART_NAME(INPUT_13:ENDIDX) break;
  case (L8212_32_N_INPUT_14 + 1):
 COPY_PART_NAME(:INPUT_14) break;
  case (L8212_32_N_INPUT_14_STARTIDX + 1):
 COPY_PART_NAME(INPUT_14:STARTIDX) break;
  case (L8212_32_N_INPUT_14_ENDIDX + 1):
 COPY_PART_NAME(INPUT_14:ENDIDX) break;
  case (L8212_32_N_INPUT_15 + 1):
 COPY_PART_NAME(:INPUT_15) break;
  case (L8212_32_N_INPUT_15_STARTIDX + 1):
 COPY_PART_NAME(INPUT_15:STARTIDX) break;
  case (L8212_32_N_INPUT_15_ENDIDX + 1):
 COPY_PART_NAME(INPUT_15:ENDIDX) break;
  case (L8212_32_N_INPUT_16 + 1):
 COPY_PART_NAME(:INPUT_16) break;
  case (L8212_32_N_INPUT_16_STARTIDX + 1):
 COPY_PART_NAME(INPUT_16:STARTIDX) break;
  case (L8212_32_N_INPUT_16_ENDIDX + 1):
 COPY_PART_NAME(INPUT_16:ENDIDX) break;
  case (L8212_32_N_INPUT_17 + 1):
 COPY_PART_NAME(:INPUT_17) break;
  case (L8212_32_N_INPUT_17_STARTIDX + 1):
 COPY_PART_NAME(INPUT_17:STARTIDX) break;
  case (L8212_32_N_INPUT_17_ENDIDX + 1):
 COPY_PART_NAME(INPUT_17:ENDIDX) break;
  case (L8212_32_N_INPUT_18 + 1):
 COPY_PART_NAME(:INPUT_18) break;
  case (L8212_32_N_INPUT_18_STARTIDX + 1):
 COPY_PART_NAME(INPUT_18:STARTIDX) break;
  case (L8212_32_N_INPUT_18_ENDIDX + 1):
 COPY_PART_NAME(INPUT_18:ENDIDX) break;
  case (L8212_32_N_INPUT_19 + 1):
 COPY_PART_NAME(:INPUT_19) break;
  case (L8212_32_N_INPUT_19_STARTIDX + 1):
 COPY_PART_NAME(INPUT_19:STARTIDX) break;
  case (L8212_32_N_INPUT_19_ENDIDX + 1):
 COPY_PART_NAME(INPUT_19:ENDIDX) break;
  case (L8212_32_N_INPUT_20 + 1):
 COPY_PART_NAME(:INPUT_20) break;
  case (L8212_32_N_INPUT_20_STARTIDX + 1):
 COPY_PART_NAME(INPUT_20:STARTIDX) break;
  case (L8212_32_N_INPUT_20_ENDIDX + 1):
 COPY_PART_NAME(INPUT_20:ENDIDX) break;
  case (L8212_32_N_INPUT_21 + 1):
 COPY_PART_NAME(:INPUT_21) break;
  case (L8212_32_N_INPUT_21_STARTIDX + 1):
 COPY_PART_NAME(INPUT_21:STARTIDX) break;
  case (L8212_32_N_INPUT_21_ENDIDX + 1):
 COPY_PART_NAME(INPUT_21:ENDIDX) break;
  case (L8212_32_N_INPUT_22 + 1):
 COPY_PART_NAME(:INPUT_22) break;
  case (L8212_32_N_INPUT_22_STARTIDX + 1):
 COPY_PART_NAME(INPUT_22:STARTIDX) break;
  case (L8212_32_N_INPUT_22_ENDIDX + 1):
 COPY_PART_NAME(INPUT_22:ENDIDX) break;
  case (L8212_32_N_INPUT_23 + 1):
 COPY_PART_NAME(:INPUT_23) break;
  case (L8212_32_N_INPUT_23_STARTIDX + 1):
 COPY_PART_NAME(INPUT_23:STARTIDX) break;
  case (L8212_32_N_INPUT_23_ENDIDX + 1):
 COPY_PART_NAME(INPUT_23:ENDIDX) break;
  case (L8212_32_N_INPUT_24 + 1):
 COPY_PART_NAME(:INPUT_24) break;
  case (L8212_32_N_INPUT_24_STARTIDX + 1):
 COPY_PART_NAME(INPUT_24:STARTIDX) break;
  case (L8212_32_N_INPUT_24_ENDIDX + 1):
 COPY_PART_NAME(INPUT_24:ENDIDX) break;
  case (L8212_32_N_INPUT_25 + 1):
 COPY_PART_NAME(:INPUT_25) break;
  case (L8212_32_N_INPUT_25_STARTIDX + 1):
 COPY_PART_NAME(INPUT_25:STARTIDX) break;
  case (L8212_32_N_INPUT_25_ENDIDX + 1):
 COPY_PART_NAME(INPUT_25:ENDIDX) break;
  case (L8212_32_N_INPUT_26 + 1):
 COPY_PART_NAME(:INPUT_26) break;
  case (L8212_32_N_INPUT_26_STARTIDX + 1):
 COPY_PART_NAME(INPUT_26:STARTIDX) break;
  case (L8212_32_N_INPUT_26_ENDIDX + 1):
 COPY_PART_NAME(INPUT_26:ENDIDX) break;
  case (L8212_32_N_INPUT_27 + 1):
 COPY_PART_NAME(:INPUT_27) break;
  case (L8212_32_N_INPUT_27_STARTIDX + 1):
 COPY_PART_NAME(INPUT_27:STARTIDX) break;
  case (L8212_32_N_INPUT_27_ENDIDX + 1):
 COPY_PART_NAME(INPUT_27:ENDIDX) break;
  case (L8212_32_N_INPUT_28 + 1):
 COPY_PART_NAME(:INPUT_28) break;
  case (L8212_32_N_INPUT_28_STARTIDX + 1):
 COPY_PART_NAME(INPUT_28:STARTIDX) break;
  case (L8212_32_N_INPUT_28_ENDIDX + 1):
 COPY_PART_NAME(INPUT_28:ENDIDX) break;
  case (L8212_32_N_INPUT_29 + 1):
 COPY_PART_NAME(:INPUT_29) break;
  case (L8212_32_N_INPUT_29_STARTIDX + 1):
 COPY_PART_NAME(INPUT_29:STARTIDX) break;
  case (L8212_32_N_INPUT_29_ENDIDX + 1):
 COPY_PART_NAME(INPUT_29:ENDIDX) break;
  case (L8212_32_N_INPUT_30 + 1):
 COPY_PART_NAME(:INPUT_30) break;
  case (L8212_32_N_INPUT_30_STARTIDX + 1):
 COPY_PART_NAME(INPUT_30:STARTIDX) break;
  case (L8212_32_N_INPUT_30_ENDIDX + 1):
 COPY_PART_NAME(INPUT_30:ENDIDX) break;
  case (L8212_32_N_INPUT_31 + 1):
 COPY_PART_NAME(:INPUT_31) break;
  case (L8212_32_N_INPUT_31_STARTIDX + 1):
 COPY_PART_NAME(INPUT_31:STARTIDX) break;
  case (L8212_32_N_INPUT_31_ENDIDX + 1):
 COPY_PART_NAME(INPUT_31:ENDIDX) break;
  case (L8212_32_N_INPUT_32 + 1):
 COPY_PART_NAME(:INPUT_32) break;
  case (L8212_32_N_INPUT_32_STARTIDX + 1):
 COPY_PART_NAME(INPUT_32:STARTIDX) break;
  case (L8212_32_N_INPUT_32_ENDIDX + 1):
 COPY_PART_NAME(INPUT_32:ENDIDX) break;
  default:
    status = TreeILLEGAL_ITEM;
  }
  return status;
}

extern int l8212_32___init();
#define free_xd_array { int i; for(i=0; i<1;i++) if(work_xd[i].l_length) MdsFree1Dx(&work_xd[i],0);}
#define error(nid,code,code1) {free_xd_array return GenDeviceSignal(nid,code,code1);}

EXPORT int l8212_32__init(struct descriptor *nid_d_ptr __attribute__ ((unused)), struct descriptor *method_d_ptr __attribute__ ((unused)))
{
  declare_variables(InInitStruct)
      static struct {
    short code;
    int value;
  } noc_t[] = {
    {0, 4}, {1, 8}, {2, 16}, {3, 32}, {0, 0}};
  static struct {
    short code;
    int value;
  } offset_t[] = {
    {0, 0}, {1, -2048}, {2, -4096}, {0, 0}};
  struct descriptor_xd work_xd[1];
  int xd_count = 0;
  memset((char *)work_xd, '\0', sizeof(struct descriptor_xd) * 1);
  initialize_variables(InInitStruct)

      read_string_error(L8212_32_N_NAME, name, DEV$_BAD_NAME);
  read_integer_error(L8212_32_N_NOC, noc, L8212$_BAD_NOC);
  check_integer_set(noc, noc_t, 4, L8212$_BAD_NOC);
  read_integer_error(L8212_32_N_PTS, pts, L8212$_BAD_PTS);
  check_range(pts, 0, 7, L8212$_BAD_PTS);
  read_integer_error(L8212_32_N_OFFSET, offset, L8212$_BAD_OFFSET);
  check_integer_set(offset, offset_t, 3, L8212$_BAD_OFFSET);
  status = l8212_32___init(nid_d_ptr, &in_struct);
  free_xd_array return status;
}

#undef free_xd_array

extern int l8212_32___store();
#define free_xd_array { int i; for(i=0; i<2;i++) if(work_xd[i].l_length) MdsFree1Dx(&work_xd[i],0);}

EXPORT int l8212_32__store(struct descriptor *nid_d_ptr __attribute__ ((unused)), struct descriptor *method_d_ptr __attribute__ ((unused)))
{
  declare_variables(InStoreStruct)
      static struct {
    short code;
    int value;
  } offset_t[] = {
    {0, 0}, {1, -2048}, {2, -4096}, {0, 0}};
  struct descriptor_xd work_xd[2];
  int xd_count = 0;
  memset((char *)work_xd, '\0', sizeof(struct descriptor_xd) * 2);
  initialize_variables(InStoreStruct)

      read_string_error(L8212_32_N_NAME, name, DEV$_BAD_NAME);
  read_integer_error(L8212_32_N_MEMORIES, memories, L8212$_BAD_MEMORIES);
  check_range(memories, 1, 16, L8212$_BAD_MEMORIES);
  read_string_error(L8212_32_N_HEADER, header, L8212$_BAD_HEADER);
  read_integer_error(L8212_32_N_OFFSET, offset, L8212$_BAD_OFFSET);
  check_integer_set(offset, offset_t, 3, L8212$_BAD_OFFSET);
  status = l8212_32___store(nid_d_ptr, &in_struct);
  free_xd_array return status;
}

#undef free_xd_array

extern int l8212_32___trigger();
#define free_xd_array { int i; for(i=0; i<1;i++) if(work_xd[i].l_length) MdsFree1Dx(&work_xd[i],0);}

EXPORT int l8212_32__trigger(struct descriptor *nid_d_ptr __attribute__ ((unused)), struct descriptor *method_d_ptr __attribute__ ((unused)))
{
  declare_variables(InTriggerStruct)
  struct descriptor_xd work_xd[1];
  int xd_count = 0;
  memset((char *)work_xd, '\0', sizeof(struct descriptor_xd) * 1);
  initialize_variables(InTriggerStruct)

      read_string_error(L8212_32_N_NAME, name, DEV$_BAD_NAME);
  status = l8212_32___trigger(nid_d_ptr, &in_struct);
  free_xd_array return status;
}

#undef free_xd_array
