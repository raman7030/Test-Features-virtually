package net.p069sf.sevenzipjbinding.impl;

import java.util.Date;
import net.p069sf.sevenzipjbinding.IInArchive;
import net.p069sf.sevenzipjbinding.IOutArchive;
import net.p069sf.sevenzipjbinding.IOutItem7z;
import net.p069sf.sevenzipjbinding.IOutItemBZip2;
import net.p069sf.sevenzipjbinding.IOutItemBase;
import net.p069sf.sevenzipjbinding.IOutItemGZip;
import net.p069sf.sevenzipjbinding.IOutItemTar;
import net.p069sf.sevenzipjbinding.IOutItemZip;
import net.p069sf.sevenzipjbinding.PropID;
import p067l.C23182;

/* JADX INFO: loaded from: classes.dex */
public class OutItemFactory {
    public static final Long ZERO = 0L;
    public int index;
    public IOutArchive outArchive;

    private void fillDefaultValuesBZip2(IOutItemBZip2 iOutItemBZip2) {
    }

    private void fillDefaultValuesGZip(IOutItemGZip iOutItemGZip) {
    }

    public OutItemFactory(IOutArchive iOutArchive, int i) {
        this.outArchive = iOutArchive;
        this.index = i;
    }

    public IOutItemBase createOutItem() {
        return createOutItemIntern();
    }

    private OutItem createOutItemIntern() {
        OutItem outItem = new OutItem(this.outArchive, this.index);
        fillDefaultValues(outItem);
        return outItem;
    }

    private void fillDefaultValues(OutItem outItem) {
        if (this.outArchive.getConnectedInArchive() != null) {
            outItem.setUpdateOldArchiveItemIndex(-1);
            Boolean bool = Boolean.TRUE;
            outItem.setUpdateIsNewData(bool);
            outItem.setUpdateIsNewProperties(bool);
        }
        outItem.setDataSize(ZERO);
        outItem.setPropertyLastModificationTime(new Date());
        int i = C23182.f72824[outItem.getArchiveFormat().ordinal()];
        if (i == 1) {
            fillDefaultValues7z(outItem);
            return;
        }
        if (i == 2) {
            fillDefaultValuesZip(outItem);
            return;
        }
        if (i == 3) {
            fillDefaultValuesBZip2(outItem);
            return;
        }
        if (i == 4) {
            fillDefaultValuesGZip(outItem);
        } else {
            if (i == 5) {
                fillDefaultValuesTar(outItem);
                return;
            }
            throw new RuntimeException("No default values strategy for the archive format '" + outItem.getArchiveFormat() + "'");
        }
    }

    private void fillDefaultValues7z(IOutItem7z iOutItem7z) {
        Boolean bool = Boolean.FALSE;
        iOutItem7z.setPropertyIsAnti(bool);
        iOutItem7z.setPropertyIsDir(bool);
        iOutItem7z.setPropertyAttributes(0);
    }

    private void fillDefaultValuesZip(IOutItemZip iOutItemZip) {
        iOutItemZip.setPropertyIsDir(Boolean.FALSE);
        iOutItemZip.setPropertyAttributes(0);
    }

    private void fillDefaultValuesTar(IOutItemTar iOutItemTar) {
        iOutItemTar.setPropertyIsDir(Boolean.FALSE);
    }

    public IOutItemBase createOutItem(int i) {
        if (this.outArchive.getConnectedInArchive() == null) {
            throw new RuntimeException("Not an update operation");
        }
        OutItem outItemCreateOutItemIntern = createOutItemIntern();
        outItemCreateOutItemIntern.setUpdateOldArchiveItemIndex(Integer.valueOf(i));
        Boolean bool = Boolean.FALSE;
        outItemCreateOutItemIntern.setUpdateIsNewData(bool);
        outItemCreateOutItemIntern.setUpdateIsNewProperties(bool);
        return outItemCreateOutItemIntern;
    }

    public IOutItemBase createOutItemAndCloneProperties(int i) {
        IInArchive connectedInArchive = this.outArchive.getConnectedInArchive();
        if (connectedInArchive == null) {
            throw new RuntimeException("Not an update operation");
        }
        OutItem outItemCreateOutItemIntern = createOutItemIntern();
        outItemCreateOutItemIntern.setUpdateOldArchiveItemIndex(Integer.valueOf(i));
        outItemCreateOutItemIntern.setUpdateIsNewData(Boolean.FALSE);
        outItemCreateOutItemIntern.setUpdateIsNewProperties(Boolean.TRUE);
        outItemCreateOutItemIntern.setPropertyPath((String) connectedInArchive.getProperty(i, PropID.PATH));
        outItemCreateOutItemIntern.setPropertyAttributes((Integer) connectedInArchive.getProperty(i, PropID.ATTRIBUTES));
        outItemCreateOutItemIntern.setPropertyPosixAttributes((Integer) connectedInArchive.getProperty(i, PropID.POSIX_ATTRIB));
        outItemCreateOutItemIntern.setPropertyUser((String) connectedInArchive.getProperty(i, PropID.USER));
        outItemCreateOutItemIntern.setPropertyGroup((String) connectedInArchive.getProperty(i, PropID.GROUP));
        outItemCreateOutItemIntern.setPropertyCreationTime((Date) connectedInArchive.getProperty(i, PropID.CREATION_TIME));
        outItemCreateOutItemIntern.setPropertyLastModificationTime((Date) connectedInArchive.getProperty(i, PropID.LAST_MODIFICATION_TIME));
        outItemCreateOutItemIntern.setPropertyLastAccessTime((Date) connectedInArchive.getProperty(i, PropID.LAST_ACCESS_TIME));
        outItemCreateOutItemIntern.setPropertyIsAnti((Boolean) connectedInArchive.getProperty(i, PropID.IS_ANTI));
        outItemCreateOutItemIntern.setPropertyIsDir((Boolean) connectedInArchive.getProperty(i, PropID.IS_FOLDER));
        return outItemCreateOutItemIntern;
    }
}
