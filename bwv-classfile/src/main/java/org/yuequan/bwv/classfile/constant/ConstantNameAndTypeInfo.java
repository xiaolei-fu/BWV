package org.yuequan.bwv.classfile.constant;

import org.yuequan.bwv.classfile.datatype.U1;
import org.yuequan.bwv.classfile.datatype.U2;
import org.yuequan.bwv.classfile.reader.ClassFileReader;

import java.nio.ByteBuffer;

public class ConstantNameAndTypeInfo extends Info {
    private final U2 nameIndex;
    private final U2 descriptorIndex;
    public ConstantNameAndTypeInfo(U1 tag, ClassFileReader fileReader) {
        super(tag, fileReader);
        this.nameIndex = new U2("name_index", fileReader.readShort());
        this.descriptorIndex = new U2("descriptor_index", fileReader.readShort());
    }

    public U2 getNameIndex() {
        return nameIndex;
    }

    public U2 getDescriptorIndex() {
        return descriptorIndex;
    }
}
