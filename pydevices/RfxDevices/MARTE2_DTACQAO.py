#
# Copyright (c) 2017, Massachusetts Institute of Technology All rights reserved.
#
# Redistribution and use in source and binary forms, with or without
# modification, are permitted provided that the following conditions are met:
#
# Redistributions of source code must retain the above copyright notice, this
# list of conditions and the following disclaimer.
#
# Redistributions in binary form must reproduce the above copyright notice, this
# list of conditions and the following disclaimer in the documentation and/or
# other materials provided with the distribution.
#
# THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
# AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
# IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
# DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
# FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
# DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
# SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
# CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
# OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
# OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
#

from MDSplus import Data
MC = __import__('MARTE2_COMPONENT', globals())


@MC.BUILDER('DTACQAO', MC.MARTE2_COMPONENT.MODE_OUTPUT)
class MARTE2_DTACQAO(MC.MARTE2_COMPONENT):
    inputs = []
    for i in range(32):
        inputs += [
            {'name': 'CHAN_'+str(i+1), 'type': 'float64', 'dimensions': 0, 'parameters': [
            {'name': 'ChannelId', 'type': 'int', 'value': i},]}]
    for i in range(32):
        inputs += [
            {'name': 'DO_'+str(i+1), 'type': 'uint8', 'dimensions': 0, 'parameters': [
            {'name': 'ChannelId', 'type': 'int', 'value': i},]}]
    parameters = [
        {'name': 'NumDac', 'type': 'int32', 'value': 0},
        {'name': 'NumDo', 'type': 'int32', 'value': 0},
        {'name': 'NumAoChans', 'type': 'int32'},
        {'name': 'IpAddress', 'type': 'string'},
        {'name': 'Port', 'type': 'int32'},
    ]
    parts = []

    def prepareMarteInfo(self):
        pass