package p067l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.۫ۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y89B */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC13959 {
    NetrConnectionEnum(8),
    NetrFileEnum(9),
    NetrFileGetInfo(10),
    NetrFileClose(11),
    NetrSessionEnum(12),
    NetrSessionDel(13),
    NetrShareAdd(14),
    NetrShareEnum(15),
    NetrShareEnumSticky(36),
    NetrShareGetInfo(16),
    NetrShareSetInfo(17),
    NetrShareDel(18),
    NetrShareDelSticky(19),
    NetrShareDelStart(37),
    NetrShareDelCommit(38),
    NetrShareCheck(20),
    NetrServerGetInfo(21),
    NetrServerSetInfo(22),
    NetrServerDiskEnum(23),
    NetrServerStatisticsGet(24),
    NetrRemoteTOD(28),
    NetrServerTransportAdd(25),
    NetrServerTransportAddEx(41),
    NetrServerTransportEnum(26),
    NetrServerTransportDel(27),
    NetrServerTransportDelEx(53),
    NetrpGetFileSecurity(39),
    NetrpSetFileSecurity(40),
    NetprPathType(30),
    NetprPathCanonicalize(31),
    NetprPathCompare(32),
    NetprNameValidate(33),
    NetprNameCanonicalize(34),
    NetprNameCompare(35),
    NetrDfsGetVersion(43),
    NetrDfsCreateLocalPartition(44),
    NetrDfsDeleteLocalPartition(45),
    NetrDfsSetLocalVolumeState(46),
    NetrDfsCreateExitPoint(48),
    NetrDfsModifyPrefix(50),
    NetrDfsDeleteExitPoint(49),
    NetrDfsFixLocalVolume(51),
    NetrDfsManagerReportSiteInfo(52),
    NetrServerAliasAdd(54),
    NetrServerAliasEnum(55),
    NetrServerAliasDel(56),
    NetrShareDelEx(57);


    /* JADX INFO: renamed from: ܽۧ */
    public static final Map f39406 = new HashMap();

    /* JADX INFO: renamed from: ᩸ */
    public final short f39420;

    static {
        for (EnumC13959 enumC13959 : values()) {
            f39406.put(Short.valueOf(enumC13959.m31731()), enumC13959);
        }
    }

    EnumC13959(int i) {
        this.f39420 = (short) i;
    }

    /* JADX INFO: renamed from: ֫ */
    public short m31731() {
        return this.f39420;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m31732(short s) {
        return this.f39420 == s;
    }

    /* JADX INFO: renamed from: ۧ */
    public static EnumC13959 m31729(short s) {
        return (EnumC13959) f39406.get(Short.valueOf(s));
    }
}
