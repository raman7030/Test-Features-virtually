.class public final Ll/ۨܿ۠;
.super Ll/᩷ܿ۠;
.source "X44P"

# interfaces
.implements Ll/᩻᩶۠;


# static fields
.field public static final ۜ֫:Ljava/util/Set;

.field public static final ۡ֫:Ljava/util/Set;

.field public static final ۢ֫:Ljava/util/Set;

.field public static final ܺ֫:Z

.field public static final ᩷֫:Ll/֨ܿ۠;

.field public static final synthetic ᩻֫:I


# instance fields
.field public final ֫֫:Ljava/util/HashMap;

.field public ۧ֫:Ll/ۖܿ۠;

.field public ܳ֫:Ll/ۛܿ۠;

.field public ܽ֫:Ljava/util/HashMap;

.field public ܿ֫:Ljava/util/HashMap;

.field public ᩳ֫:Ll/᩶۫᩷;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    const/4 v0, 0x2

    new-array v1, v0, [Ljava/lang/Object;

    .line 0
    sget-object v2, Ll/ܽ᩶۠;->۬:Ll/ܽ᩶۠;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Ll/ܽ᩶۠;->᩶:Ll/ܽ᩶۠;

    const/4 v4, 0x1

    aput-object v2, v1, v4

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2, v0}, Ljava/util/HashSet;-><init>(I)V

    const/4 v5, 0x0

    :goto_0
    const-string v6, "duplicate element: "

    if-ge v5, v0, :cond_1

    aget-object v7, v1, v5

    invoke-static {v7}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {v7, v6}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {v2}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    .line 105
    sput-object v0, Ll/ۨܿ۠;->ۡ֫:Ljava/util/Set;

    .line 360
    new-instance v0, Ll/֨ܿ۠;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ۨܿ۠;->᩷֫:Ll/֨ܿ۠;

    .line 0
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 548
    sput-object v0, Ll/ۨܿ۠;->ۢ֫:Ljava/util/Set;

    new-array v0, v4, [Ljava/lang/Object;

    .line 0
    sget-object v1, Ll/ۧ۠ᩴ;->FOLLOW_LINKS:Ll/ۧ۠ᩴ;

    aput-object v1, v0, v3

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1, v4}, Ljava/util/HashSet;-><init>(I)V

    aget-object v0, v0, v3

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    .line 549
    sput-object v0, Ll/ۨܿ۠;->ۜ֫:Ljava/util/Set;

    .line 676
    sget-char v0, Ljava/io/File;->separatorChar:C

    const/16 v1, 0x2f

    if-ne v0, v1, :cond_2

    const/4 v3, 0x1

    :cond_2
    sput-boolean v3, Ll/ۨܿ۠;->ܺ֫:Z

    return-void

    .line 0
    :cond_3
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-static {v0, v6}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public constructor <init>(Ll/ۗ֨۠;ZLjava/nio/charset/Charset;)V
    .locals 0

    .line 154
    invoke-direct {p0, p3}, Ll/᩷ܿ۠;-><init>(Ljava/nio/charset/Charset;)V

    .line 109
    new-instance p3, Ll/᩶۫᩷;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Ll/ۨܿ۠;->ᩳ֫:Ll/᩶۫᩷;

    .line 134
    new-instance p3, Ljava/util/HashMap;

    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    iput-object p3, p0, Ll/ۨܿ۠;->ܿ֫:Ljava/util/HashMap;

    .line 138
    new-instance p3, Ljava/util/HashMap;

    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    iput-object p3, p0, Ll/ۨܿ۠;->ܽ֫:Ljava/util/HashMap;

    .line 289
    new-instance p3, Ljava/util/HashMap;

    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    iput-object p3, p0, Ll/ۨܿ۠;->֫֫:Ljava/util/HashMap;

    if-eqz p2, :cond_0

    .line 156
    const-class p2, Ll/ۧ᩶۠;

    invoke-virtual {p1, p2, p0}, Ll/ۗ֨۠;->֫(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 157
    :cond_0
    invoke-virtual {p0, p1}, Ll/ۨܿ۠;->֫(Ll/ۗ֨۠;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ۨܿ۠;Ll/֫᩶۠;)Ljava/util/List;
    .locals 0

    .line 1020
    iget-object p0, p0, Ll/ۨܿ۠;->ܽ֫:Ljava/util/HashMap;

    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method private ֫(Ll/֫᩶۠;Ll/ۛܳ۠;Ll/۟᩹۠;)Ll/۫ܳ۠;
    .locals 6

    .line 905
    sget-object v0, Ll/᩷᩶۠;->ۙ:Ll/᩷᩶۠;

    iget-object v1, p0, Ll/ۨܿ۠;->ᩳ֫:Ll/᩶۫᩷;

    iget-object v2, p0, Ll/᩷ܿ۠;->ۛ:Ll/᩹ܳ۠;

    const/4 v3, 0x0

    if-ne p1, v0, :cond_4

    .line 1122
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2139
    invoke-interface {v0}, Ll/֫᩶۠;->ۧ()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 2142
    invoke-virtual {v2, v0}, Ll/᩹ܳ۠;->֫(Ll/֫᩶۠;)Ll/ۧܳ۠;

    move-result-object p1

    .line 2143
    check-cast p1, Ll/ᩴܳ۠;

    invoke-static {p1}, Ll/ᩴܳ۠;->֫(Ll/ᩴܳ۠;)Ll/᩷۠ᩴ;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 1122
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2139
    invoke-interface {v0}, Ll/֫᩶۠;->ۧ()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2142
    :goto_0
    invoke-virtual {v2, v0}, Ll/᩹ܳ۠;->֫(Ll/֫᩶۠;)Ll/ۧܳ۠;

    move-result-object p1

    .line 2143
    :goto_1
    check-cast p1, Ll/ᩴܳ۠;

    invoke-static {p1}, Ll/ᩴܳ۠;->֫(Ll/ᩴܳ۠;)Ll/᩷۠ᩴ;

    move-result-object p1

    goto/16 :goto_3

    .line 2140
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    .line 188
    :cond_1
    iget-object p1, p2, Ll/ۨܳ۠;->᩸:Ljava/lang/String;

    const/16 p2, 0x2f

    invoke-virtual {p1, p2}, Ljava/lang/String;->lastIndexOf(I)I

    move-result p2

    add-int/lit8 p2, p2, 0x1

    .line 189
    invoke-virtual {p1, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p3, :cond_2

    .line 910
    instance-of p2, p3, Ll/۫ܳ۠;

    if-eqz p2, :cond_2

    check-cast p3, Ll/۫ܳ۠;

    .line 911
    invoke-virtual {p3, p1}, Ll/۫ܳ۠;->֫(Ljava/lang/String;)Ll/۫ܳ۠;

    move-result-object p1

    return-object p1

    :cond_2
    new-array p2, v3, [Ljava/lang/String;

    .line 184
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, p2}, Ll/ۡ۠ᩴ;->get(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object p1

    .line 914
    iget-object p2, p0, Ll/ۨܿ۠;->ۧ֫:Ll/ۖܿ۠;

    invoke-virtual {p2, p1}, Ll/ۖܿ۠;->ۧ(Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;

    move-result-object p2

    .line 915
    sget p3, Ll/۫ܳ۠;->ᩳ:I

    .line 228
    new-instance p3, Ll/۬ܳ۠;

    invoke-direct {p3, p0, p2, p1, v3}, Ll/۬ܳ۠;-><init>(Ll/᩷ܿ۠;Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;I)V

    return-object p3

    .line 2140
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    .line 918
    :cond_4
    sget-object p3, Ll/᩷᩶۠;->᩺:Ll/᩷᩶۠;

    if-ne p1, p3, :cond_9

    .line 1126
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2139
    invoke-interface {p3}, Ll/֫᩶۠;->ۧ()Z

    move-result p1

    if-eqz p1, :cond_8

    .line 2142
    invoke-virtual {v2, p3}, Ll/᩹ܳ۠;->֫(Ll/֫᩶۠;)Ll/ۧܳ۠;

    move-result-object p1

    .line 2143
    check-cast p1, Ll/ᩴܳ۠;

    invoke-static {p1}, Ll/ᩴܳ۠;->֫(Ll/ᩴܳ۠;)Ll/᩷۠ᩴ;

    move-result-object p1

    if-eqz p1, :cond_6

    .line 1126
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2139
    invoke-interface {p3}, Ll/֫᩶۠;->ۧ()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 2142
    invoke-virtual {v2, p3}, Ll/᩹ܳ۠;->֫(Ll/֫᩶۠;)Ll/ۧܳ۠;

    move-result-object p1

    goto :goto_1

    .line 2140
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    .line 1122
    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2139
    invoke-interface {v0}, Ll/֫᩶۠;->ۧ()Z

    move-result p1

    if-eqz p1, :cond_7

    goto/16 :goto_0

    .line 2140
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    .line 2134
    :cond_9
    invoke-virtual {v2, p1}, Ll/᩹ܳ۠;->֫(Ll/֫᩶۠;)Ll/ۧܳ۠;

    move-result-object p1

    const/4 p3, 0x0

    if-nez p1, :cond_a

    move-object p1, p3

    goto :goto_2

    .line 2135
    :cond_a
    invoke-virtual {p1}, Ll/ۧܳ۠;->ܽ()Ljava/util/Collection;

    move-result-object p1

    .line 923
    :goto_2
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩷۠ᩴ;

    goto :goto_3

    :cond_b
    move-object p1, p3

    :goto_3
    if-nez p1, :cond_c

    :try_start_0
    const-string p1, "user.dir"

    .line 931
    invoke-static {p1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array p3, v3, [Ljava/lang/String;

    .line 184
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, p3}, Ll/ۡ۠ᩴ;->get(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object p1

    goto :goto_4

    :catch_0
    move-exception p1

    goto :goto_5

    :cond_c
    :goto_4
    move-object v3, p1

    .line 933
    iget-object p1, p0, Ll/ۨܿ۠;->ۧ֫:Ll/ۖܿ۠;

    invoke-virtual {p1, v3}, Ll/ۖܿ۠;->ۧ(Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/ۨܳ۠;->֫(Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;

    move-result-object v2

    .line 934
    sget p1, Ll/۫ܳ۠;->ᩳ:I

    .line 102
    new-instance p1, Ll/ۙܳ۠;

    const/4 v5, 0x0

    move-object v0, p1

    move-object v1, p0

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Ll/ۙܳ۠;-><init>(Ll/᩷ܿ۠;Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;Ll/ۛܳ۠;I)V
    :try_end_0
    .catch Ljava/nio/file/InvalidPathException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 936
    :goto_5
    new-instance p3, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "bad filename "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p3, p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p3
.end method

.method public static ֫(Ll/ۨܿ۠;Ll/᩷۠ᩴ;Ll/ۤܳ۠;)Z
    .locals 6

    .line 684
    sget-boolean p0, Ll/ۨܿ۠;->ܺ֫:Z

    const/4 v0, 0x1

    if-eqz p0, :cond_0

    goto :goto_3

    :cond_0
    const/4 p0, 0x0

    :try_start_0
    new-array v1, v0, [Ll/ܳ۠ᩴ;

    .line 690
    sget-object v2, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    aput-object v2, v1, p0

    invoke-interface {p1, v1}, Ll/᩷۠ᩴ;->toRealPath([Ll/ܳ۠ᩴ;)Ll/᩷۠ᩴ;

    move-result-object v1

    invoke-interface {v1}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object v1

    .line 691
    invoke-interface {p1}, Ll/᩷۠ᩴ;->getFileSystem()Ll/۟֨ᩴ;

    move-result-object p1

    invoke-virtual {p1}, Ll/۟֨ᩴ;->getSeparator()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 695
    invoke-virtual {v1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    .line 696
    iget-object p2, p2, Ll/ۨܳ۠;->᩸:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->toCharArray()[C

    move-result-object p2

    .line 697
    array-length v2, v1

    sub-int/2addr v2, v0

    .line 698
    array-length v3, p2

    sub-int/2addr v3, v0

    :cond_1
    :goto_0
    if-ltz v2, :cond_5

    if-ltz v3, :cond_5

    :goto_1
    if-ltz v2, :cond_2

    .line 700
    aget-char v4, v1, v2

    if-ne v4, p1, :cond_2

    add-int/lit8 v2, v2, -0x1

    goto :goto_1

    :cond_2
    :goto_2
    if-ltz v3, :cond_3

    .line 701
    aget-char v4, p2, v3

    const/16 v5, 0x2f

    if-ne v4, v5, :cond_3

    add-int/lit8 v3, v3, -0x1

    goto :goto_2

    :cond_3
    if-ltz v2, :cond_1

    if-ltz v3, :cond_1

    .line 703
    aget-char v4, v1, v2

    aget-char v5, p2, v3

    if-eq v4, v5, :cond_4

    goto :goto_4

    :cond_4
    add-int/lit8 v2, v2, -0x1

    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    :cond_5
    if-gez v3, :cond_6

    :goto_3
    return v0

    :catch_0
    :cond_6
    :goto_4
    return p0
.end method

.method public static bridge synthetic ۜ()Ljava/util/Set;
    .locals 1

    .line 0
    sget-object v0, Ll/ۨܿ۠;->ۢ֫:Ljava/util/Set;

    return-object v0
.end method

.method public static ۜ(Ll/֫᩶۠;)V
    .locals 3

    .line 1264
    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1265
    invoke-interface {p0}, Ll/֫᩶۠;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 1266
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "location is not an output location: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p0}, Ll/֫᩶۠;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ۧ(Ll/ۨܿ۠;Ll/֫᩶۠;)Ljava/util/HashMap;
    .locals 8

    .line 1028
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 1065
    invoke-virtual {p0, p1}, Ll/ۨܿ۠;->ܿ(Ll/֫᩶۠;)Ljava/util/Collection;

    move-result-object v1

    if-nez v1, :cond_0

    .line 1067
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v1

    goto :goto_1

    .line 1069
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    .line 1070
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1071
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷۠ᩴ;

    .line 1074
    :try_start_0
    invoke-virtual {p0, v3}, Ll/ۨܿ۠;->֫(Ll/᩷۠ᩴ;)Ll/ۙܿ۠;

    move-result-object v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1078
    new-instance v5, Ll/۬ܿ۠;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v6

    invoke-direct {v5, v3, v4, v6}, Ll/۬ܿ۠;-><init>(Ll/᩷۠ᩴ;Ll/ۙܿ۠;I)V

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catch_0
    move-exception p0

    .line 1076
    new-instance p1, Ljava/io/UncheckedIOException;

    invoke-direct {p1, p0}, Ljava/io/UncheckedIOException;-><init>(Ljava/io/IOException;)V

    throw p1

    :cond_1
    move-object v1, v2

    .line 1033
    :goto_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1034
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۬ܿ۠;

    .line 1035
    invoke-static {v4}, Ll/۬ܿ۠;->֫(Ll/۬ܿ۠;)Ll/ۙܿ۠;

    move-result-object v5

    invoke-interface {v5}, Ll/ۙܿ۠;->ۧ()Z

    move-result v5

    if-nez v5, :cond_2

    .line 1036
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 1042
    :cond_3
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۬ܿ۠;

    .line 1043
    invoke-static {v3}, Ll/۬ܿ۠;->֫(Ll/۬ܿ۠;)Ll/ۙܿ۠;

    move-result-object v4

    .line 1044
    invoke-interface {v4}, Ll/ۙܿ۠;->ۧ()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 1045
    invoke-interface {v4}, Ll/ۙܿ۠;->֫()Ljava/lang/Iterable;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۤܳ۠;

    .line 1046
    new-instance v6, Ll/ۛᩴܿ;

    const/4 v7, 0x1

    invoke-direct {v6, v7, v2}, Ll/ۛᩴܿ;-><init>(ILjava/io/Serializable;)V

    invoke-static {v0, v5, v6}, Ll/ܰ۬ᩴ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 1047
    invoke-interface {v5, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 1051
    :cond_5
    iget-object p0, p0, Ll/ۨܿ۠;->ܽ֫:Ljava/util/HashMap;

    invoke-virtual {p0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1055
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p0

    new-instance p1, Ll/֡ܿ۠;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-static {p0, p1}, Ll/᩶֨ᩴ;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    return-object v0
.end method

.method public static bridge synthetic ۧ(Ll/ۨܿ۠;)Ll/ۖܿ۠;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۨܿ۠;->ۧ֫:Ll/ۖܿ۠;

    return-object p0
.end method

.method public static ܳ(Ll/֫᩶۠;)V
    .locals 3

    .line 1270
    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1271
    invoke-interface {p0}, Ll/֫᩶۠;->֫()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p0}, Ll/֫᩶۠;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 1272
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "location is not an output location or a module-oriented location: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1274
    invoke-interface {p0}, Ll/֫᩶۠;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public static bridge synthetic ᩻()Ljava/util/Set;
    .locals 1

    .line 0
    sget-object v0, Ll/ۨܿ۠;->ۜ֫:Ljava/util/Set;

    return-object v0
.end method

.method public static ᩻(Ll/֫᩶۠;)V
    .locals 3

    .line 1278
    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1279
    invoke-interface {p0}, Ll/֫᩶۠;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 1280
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "location is module-oriented: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p0}, Ll/֫᩶۠;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final close()V
    .locals 5

    .line 725
    iget-wide v0, p0, Ll/᩷ܿ۠;->۬:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    .line 146
    new-instance v0, Ll/ᩳܿ۠;

    const-class v1, Ll/ۨܿ۠;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, " DeferredClose"

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Ll/ᩳܿ۠;-><init>(Ll/ۨܿ۠;Ljava/lang/String;)V

    const/4 v1, 0x1

    .line 164
    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 165
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void

    .line 730
    :cond_0
    iget-object v0, p0, Ll/᩷ܿ۠;->ۛ:Ll/᩹ܳ۠;

    invoke-virtual {v0}, Ll/᩹ܳ۠;->֫()V

    .line 731
    iget-object v0, p0, Ll/ۨܿ۠;->֫֫:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۙܿ۠;

    .line 732
    invoke-interface {v2}, Ll/ۙܿ۠;->close()V

    goto :goto_0

    .line 734
    :cond_1
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 735
    iget-object v0, p0, Ll/ۨܿ۠;->ܿ֫:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 736
    iget-object v0, p0, Ll/ۨܿ۠;->ܽ֫:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 737
    iget-object v0, p0, Ll/᩷ܿ۠;->ۙ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public final flush()V
    .locals 1

    .line 715
    iget-object v0, p0, Ll/᩷ܿ۠;->ۙ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 716
    iget-object v0, p0, Ll/ۨܿ۠;->ܿ֫:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 717
    iget-object v0, p0, Ll/ۨܿ۠;->ܽ֫:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public final ֫(Ll/֫᩶۠;Ljava/lang/String;Ljava/util/Set;Z)Ljava/lang/Iterable;
    .locals 8

    .line 765
    invoke-static {p1}, Ll/ۨܿ۠;->᩻(Ll/֫᩶۠;)V

    .line 510
    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 511
    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 104
    :cond_0
    new-instance v0, Ll/ۤܳ۠;

    invoke-virtual {p2}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object p2

    const/16 v1, 0x2e

    const/16 v2, 0x2f

    invoke-virtual {p2, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2}, Ll/ۤܳ۠;-><init>(Ljava/lang/String;)V

    .line 771
    new-instance p2, Ll/ᩴܶ۠;

    invoke-direct {p2}, Ll/ᩴܶ۠;-><init>()V

    .line 1017
    :try_start_0
    iget-object v1, p0, Ll/ۨܿ۠;->ܿ֫:Ljava/util/HashMap;

    new-instance v2, Ll/ۚ᩻᩷;

    const/4 v3, 0x2

    invoke-direct {v2, v3, p0}, Ll/ۚ᩻᩷;-><init>(ILjava/lang/Object;)V

    invoke-static {v1, p1, v2}, Ll/ܰ۬ᩴ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    new-instance v2, Ll/᩵ܿ۠;

    invoke-direct {v2, p0, p1}, Ll/᩵ܿ۠;-><init>(Ll/ۨܿ۠;Ll/֫᩶۠;)V

    .line 1019
    invoke-static {v1, v0, v2}, Ll/ܰ۬ᩴ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;
    :try_end_0
    .catch Ljava/io/UncheckedIOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 773
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬ܿ۠;

    .line 774
    invoke-static {v1}, Ll/۬ܿ۠;->ۧ(Ll/۬ܿ۠;)Ll/᩷۠ᩴ;

    move-result-object v3

    .line 775
    invoke-static {v1}, Ll/۬ܿ۠;->֫(Ll/۬ܿ۠;)Ll/ۙܿ۠;

    move-result-object v2

    move-object v4, v0

    move-object v5, p3

    move v6, p4

    move-object v7, p2

    .line 776
    invoke-interface/range {v2 .. v7}, Ll/ۙܿ۠;->֫(Ll/᩷۠ᩴ;Ll/ۤܳ۠;Ljava/util/Set;ZLl/ᩴܶ۠;)V

    goto :goto_1

    .line 779
    :cond_1
    invoke-virtual {p2}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    .line 1022
    invoke-virtual {p1}, Ljava/io/UncheckedIOException;->getCause()Ljava/io/IOException;

    move-result-object p1

    throw p1
.end method

.method public final ֫(Ll/֫᩶۠;Ll/ᩳ᩶۠;)Ljava/lang/String;
    .locals 1

    .line 784
    invoke-static {p1}, Ll/ۨܿ۠;->᩻(Ll/֫᩶۠;)V

    .line 785
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 787
    invoke-virtual {p0, p1}, Ll/ۨܿ۠;->ܿ(Ll/֫᩶۠;)Ljava/util/Collection;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 792
    :cond_0
    instance-of v0, p2, Ll/۫ܳ۠;

    if-eqz v0, :cond_1

    check-cast p2, Ll/۫ܳ۠;

    .line 793
    invoke-virtual {p2, p1}, Ll/۫ܳ۠;->֫(Ljava/util/Collection;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 795
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ljava/util/LinkedHashSet;)Ljava/util/ArrayList;
    .locals 5

    if-eqz p1, :cond_1

    .line 962
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 963
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷۠ᩴ;

    .line 964
    iget-object v2, p0, Ll/ۨܿ۠;->ۧ֫:Ll/ۖܿ۠;

    .line 965
    invoke-virtual {v2, v1}, Ll/ۖܿ۠;->ۧ(Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;

    move-result-object v2

    .line 964
    sget v3, Ll/۫ܳ۠;->ᩳ:I

    .line 228
    new-instance v3, Ll/۬ܳ۠;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v2, v1, v4}, Ll/۬ܳ۠;-><init>(Ll/᩷ܿ۠;Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;I)V

    .line 964
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0

    .line 967
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1
.end method

.method public final ֫(Ll/֫᩶۠;Ljava/lang/Class;)Ljava/util/ServiceLoader;
    .locals 0

    .line 506
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1153
    invoke-virtual {p0, p1}, Ll/ۨܿ۠;->ܽ(Ll/֫᩶۠;)Ljava/lang/ClassLoader;

    move-result-object p1

    invoke-static {p2, p1}, Ljava/util/ServiceLoader;->load(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/ServiceLoader;

    move-result-object p1

    return-object p1
.end method

.method public final declared-synchronized ֫(Ll/᩷۠ᩴ;)Ll/ۙܿ۠;
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 292
    :try_start_0
    iget-object v1, p0, Ll/ۨܿ۠;->֫֫:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙܿ۠;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 295
    monitor-exit v0

    return-object v1

    .line 303
    :cond_0
    :try_start_1
    iget-object v1, p0, Ll/ۨܿ۠;->ۧ֫:Ll/ۖܿ۠;

    invoke-virtual {v1, p1}, Ll/ۖܿ۠;->ۧ(Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;

    move-result-object v1

    .line 305
    iget-object v2, p0, Ll/ۨܿ۠;->֫֫:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۙܿ۠;

    if-eqz v2, :cond_1

    .line 308
    iget-object v1, p0, Ll/ۨܿ۠;->֫֫:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 309
    monitor-exit v0

    return-object v2

    .line 315
    :cond_1
    :try_start_2
    const-class v3, Ll/ܶ۠ᩴ;

    const/4 v4, 0x0

    new-array v4, v4, [Ll/ܳ۠ᩴ;

    invoke-static {v1, v3, v4}, Ll/ܿ۠ᩴ;->readAttributes(Ll/᩷۠ᩴ;Ljava/lang/Class;[Ll/ܳ۠ᩴ;)Ll/ܶ۠ᩴ;

    move-result-object v3
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 318
    :catch_0
    :try_start_3
    sget-object v2, Ll/ۨܿ۠;->᩷֫:Ll/֨ܿ۠;

    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_3

    .line 322
    invoke-interface {v3}, Ll/ܶ۠ᩴ;->isDirectory()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 323
    new-instance v2, Ll/ۗܿ۠;

    invoke-direct {v2, p0, v1}, Ll/ۗܿ۠;-><init>(Ll/ۨܿ۠;Ll/᩷۠ᩴ;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2

    .line 326
    :cond_2
    :try_start_4
    new-instance v2, Ll/᩶ܿ۠;

    invoke-direct {v2, p0, p1}, Ll/᩶ܿ۠;-><init>(Ll/ۨܿ۠;Ll/᩷۠ᩴ;)V
    :try_end_4
    .catch Ljava/nio/file/ProviderNotFoundException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_2

    :catch_1
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    .line 328
    :goto_1
    :try_start_5
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 333
    :cond_3
    :goto_2
    iget-object v3, p0, Ll/ۨܿ۠;->֫֫:Ljava/util/HashMap;

    invoke-virtual {v3, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 334
    iget-object v1, p0, Ll/ۨܿ۠;->֫֫:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 336
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception p1

    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/֫᩶۠;Ljava/lang/String;)Ll/۟᩹۠;
    .locals 3

    .line 888
    invoke-static {p1}, Ll/ۨܿ۠;->ۜ(Ll/֫᩶۠;)V

    .line 1218
    :try_start_0
    new-instance v0, Ljava/net/URI;

    invoke-direct {v0, p2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 1203
    invoke-virtual {v0}, Ljava/net/URI;->isAbsolute()Z

    move-result v1

    if-nez v1, :cond_0

    .line 1205
    invoke-virtual {v0}, Ljava/net/URI;->normalize()Ljava/net/URI;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/URI;->getPath()Ljava/lang/String;

    move-result-object v1

    .line 1206
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_0

    .line 1208
    invoke-virtual {v0}, Ljava/net/URI;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "/"

    .line 1210
    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "./"

    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "../"

    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_0

    .line 894
    new-instance v0, Ll/ۛܳ۠;

    invoke-direct {v0, p2}, Ll/ۛܳ۠;-><init>(Ljava/lang/String;)V

    const/4 p2, 0x0

    .line 896
    invoke-direct {p0, p1, v0, p2}, Ll/ۨܿ۠;->֫(Ll/֫᩶۠;Ll/ۛܳ۠;Ll/۟᩹۠;)Ll/۫ܳ۠;

    move-result-object p1

    return-object p1

    .line 892
    :catch_0
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid relative name: "

    .line 0
    invoke-static {v0, p2}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 892
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/֫᩶۠;Ljava/lang/String;Ll/ܽ᩶۠;)Ll/ᩳ᩶۠;
    .locals 1

    .line 824
    invoke-static {p1}, Ll/ۨܿ۠;->᩻(Ll/֫᩶۠;)V

    .line 506
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 828
    sget-object v0, Ll/ۨܿ۠;->ۡ֫:Ljava/util/Set;

    invoke-interface {v0, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 830
    invoke-static {p2, p3}, Ll/ۛܳ۠;->֫(Ljava/lang/String;Ll/ܽ᩶۠;)Ll/ۛܳ۠;

    move-result-object p2

    .line 851
    invoke-virtual {p0, p1}, Ll/ۨܿ۠;->ܿ(Ll/֫᩶۠;)Ljava/util/Collection;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 855
    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/᩷۠ᩴ;

    .line 856
    invoke-virtual {p0, p3}, Ll/ۨܿ۠;->֫(Ll/᩷۠ᩴ;)Ll/ۙܿ۠;

    move-result-object v0

    invoke-interface {v0, p3, p2}, Ll/ۙܿ۠;->֫(Ll/᩷۠ᩴ;Ll/ۛܳ۠;)Ll/ᩳ᩶۠;

    move-result-object p3

    if-eqz p3, :cond_1

    return-object p3

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return-object p1

    .line 829
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Invalid kind: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/֫᩶۠;Ljava/lang/String;Ll/ܽ᩶۠;Ll/۟᩹۠;)Ll/ᩳ᩶۠;
    .locals 1

    .line 872
    invoke-static {p1}, Ll/ۨܿ۠;->ۜ(Ll/֫᩶۠;)V

    .line 506
    invoke-static {p3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 876
    sget-object v0, Ll/ۨܿ۠;->ۡ֫:Ljava/util/Set;

    invoke-interface {v0, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 878
    invoke-static {p2, p3}, Ll/ۛܳ۠;->֫(Ljava/lang/String;Ll/ܽ᩶۠;)Ll/ۛܳ۠;

    move-result-object p2

    invoke-direct {p0, p1, p2, p4}, Ll/ۨܿ۠;->֫(Ll/֫᩶۠;Ll/ۛܳ۠;Ll/۟᩹۠;)Ll/۫ܳ۠;

    move-result-object p1

    return-object p1

    .line 877
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p4, "Invalid kind: "

    invoke-direct {p2, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ۗ֨۠;)V
    .locals 1

    .line 165
    invoke-super {p0, p1}, Ll/᩷ܿ۠;->֫(Ll/ۗ֨۠;)V

    .line 62
    const-class v0, Ll/ۖܿ۠;

    invoke-virtual {p1, v0}, Ll/ۗ֨۠;->֫(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۖܿ۠;

    if-nez p1, :cond_0

    .line 64
    new-instance p1, Ll/ۖܿ۠;

    invoke-direct {p1}, Ll/ۖܿ۠;-><init>()V

    .line 167
    :cond_0
    iput-object p1, p0, Ll/ۨܿ۠;->ۧ֫:Ll/ۖܿ۠;

    .line 169
    iget-object p1, p0, Ll/᩷ܿ۠;->ܰ:Ll/ۨܶ۠;

    const-string v0, "ignore.symbol.file"

    invoke-virtual {p1, v0}, Ll/ۨܶ۠;->ۧ(Ljava/lang/String;)Z

    .line 171
    iget-object p1, p0, Ll/᩷ܿ۠;->ܰ:Ll/ۨܶ۠;

    const-string v0, "sortFiles"

    invoke-virtual {p1, v0}, Ll/ۨܶ۠;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    const-string v0, "reverse"

    .line 173
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Ll/ۛܿ۠;->᩶:Ll/ۛܿ۠;

    goto :goto_0

    :cond_1
    sget-object p1, Ll/ۛܿ۠;->᩹:Ll/ۛܿ۠;

    :goto_0
    iput-object p1, p0, Ll/ۨܿ۠;->ܳ֫:Ll/ۛܿ۠;

    :cond_2
    return-void
.end method

.method public final ֫(Ll/᩷᩶۠;Ljava/lang/Iterable;)V
    .locals 3

    .line 506
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    .line 1291
    :cond_0
    new-instance v0, Ll/ۚܿ۠;

    invoke-direct {v0, p2}, Ll/ۚܿ۠;-><init>(Ljava/lang/Iterable;)V

    move-object p2, v0

    .line 2147
    :goto_0
    iget-object v0, p0, Ll/᩷ܿ۠;->ۛ:Ll/᩹ܳ۠;

    invoke-virtual {v0, p1}, Ll/᩹ܳ۠;->֫(Ll/֫᩶۠;)Ll/ۧܳ۠;

    move-result-object v1

    if-nez v1, :cond_2

    .line 2149
    invoke-interface {p1}, Ll/֫᩶۠;->ۧ()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 2150
    new-instance v1, Ll/ᩴܳ۠;

    new-array v2, v2, [Ll/֡ۖ۠;

    invoke-direct {v1, v0, p1, v2}, Ll/ᩴܳ۠;-><init>(Ll/᩹ܳ۠;Ll/֫᩶۠;[Ll/֡ۖ۠;)V

    goto :goto_1

    .line 2152
    :cond_1
    new-instance v1, Ll/۠ܳ۠;

    new-array v2, v2, [Ll/֡ۖ۠;

    invoke-direct {v1, v0, p1, v2}, Ll/۠ܳ۠;-><init>(Ll/᩹ܳ۠;Ll/֫᩶۠;[Ll/֡ۖ۠;)V

    .line 2154
    :goto_1
    iget-object v0, v0, Ll/᩹ܳ۠;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2156
    :cond_2
    invoke-virtual {v1, p2}, Ll/ۧܳ۠;->֫(Ljava/lang/Iterable;)V

    .line 1340
    iget-object p2, p0, Ll/ۨܿ۠;->ܿ֫:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1341
    iget-object p2, p0, Ll/ۨܿ۠;->ܽ֫:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ll/֡ۖ۠;Ljava/lang/String;)Z
    .locals 1

    .line 1331
    sget-object v0, Ll/᩷ܿ۠;->۟:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1332
    iget-object v0, p0, Ll/ۨܿ۠;->ܿ֫:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 1333
    iget-object v0, p0, Ll/ۨܿ۠;->ܽ֫:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 1335
    :cond_0
    invoke-super {p0, p1, p2}, Ll/᩷ܿ۠;->֫(Ll/֡ۖ۠;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final ֫(Ll/֫᩶۠;)Z
    .locals 1

    .line 506
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 810
    iget-object v0, p0, Ll/᩷ܿ۠;->ۛ:Ll/᩹ܳ۠;

    .line 2124
    invoke-virtual {v0, p1}, Ll/᩹ܳ۠;->֫(Ll/֫᩶۠;)Ll/ۧܳ۠;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2125
    :cond_0
    invoke-virtual {p1}, Ll/ۧܳ۠;->ܿ()Z

    move-result p1

    return p1
.end method

.method public final ֫(Ll/֫᩶۠;Ll/۟᩹۠;)Z
    .locals 1

    .line 506
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1189
    instance-of v0, p2, Ll/۫ܳ۠;

    if-eqz v0, :cond_1

    check-cast p2, Ll/۫ܳ۠;

    .line 1190
    iget-object p2, p2, Ll/۫ܳ۠;->ܽ:Ll/᩷۠ᩴ;

    .line 1118
    iget-object v0, p0, Ll/᩷ܿ۠;->ۛ:Ll/᩹ܳ۠;

    .line 2194
    invoke-virtual {v0, p1}, Ll/᩹ܳ۠;->֫(Ll/֫᩶۠;)Ll/ۧܳ۠;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2197
    invoke-virtual {p1, p2}, Ll/ۧܳ۠;->֫(Ll/᩷۠ᩴ;)Z

    move-result p1

    return p1

    .line 2196
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "unknown location"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1192
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-interface {p2}, Ll/۟᩹۠;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/۟᩹۠;Ll/۟᩹۠;)Z
    .locals 2

    .line 506
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 802
    instance-of v0, p1, Ll/۫ܳ۠;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ll/۫ܳ۠;

    instance-of v1, p2, Ll/۫ܳ۠;

    if-eqz v1, :cond_0

    check-cast p2, Ll/۫ܳ۠;

    .line 482
    iget-object p1, v0, Ll/۫ܳ۠;->ܽ:Ll/᩷۠ᩴ;

    iget-object p2, p2, Ll/۫ܳ۠;->ܽ:Ll/᩷۠ᩴ;

    invoke-interface {p1, p2}, Ll/᩷۠ᩴ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 804
    :cond_0
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ۧ(Ll/֫᩶۠;)Ljava/lang/Iterable;
    .locals 1

    .line 1183
    invoke-static {p1}, Ll/ۨܿ۠;->ܳ(Ll/֫᩶۠;)V

    .line 1184
    iget-object v0, p0, Ll/᩷ܿ۠;->ۛ:Ll/᩹ܳ۠;

    .line 2189
    invoke-virtual {v0, p1}, Ll/᩹ܳ۠;->֫(Ll/֫᩶۠;)Ll/ۧܳ۠;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 2190
    :cond_0
    invoke-virtual {p1}, Ll/ۧܳ۠;->ܳ()Ljava/lang/Iterable;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ll/֫᩶۠;Ljava/lang/String;)Ll/֫᩶۠;
    .locals 3

    .line 1131
    invoke-static {p1}, Ll/ۨܿ۠;->ܳ(Ll/֫᩶۠;)V

    .line 506
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1133
    sget-object v0, Ll/᩷᩶۠;->᩺:Ll/᩷᩶۠;

    iget-object v1, p0, Ll/᩷ܿ۠;->ۛ:Ll/᩹ܳ۠;

    if-ne p1, v0, :cond_1

    .line 1126
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2139
    invoke-interface {v0}, Ll/֫᩶۠;->ۧ()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 2142
    invoke-virtual {v1, v0}, Ll/᩹ܳ۠;->֫(Ll/֫᩶۠;)Ll/ۧܳ۠;

    move-result-object v0

    .line 2143
    check-cast v0, Ll/ᩴܳ۠;

    invoke-static {v0}, Ll/ᩴܳ۠;->֫(Ll/ᩴܳ۠;)Ll/᩷۠ᩴ;

    move-result-object v0

    if-nez v0, :cond_1

    .line 1134
    sget-object p1, Ll/᩷᩶۠;->ۙ:Ll/᩷᩶۠;

    goto :goto_0

    .line 2140
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    .line 2160
    :cond_1
    :goto_0
    invoke-virtual {v1, p1}, Ll/᩹ܳ۠;->֫(Ll/֫᩶۠;)Ll/ۧܳ۠;

    move-result-object p1

    if-nez p1, :cond_2

    const/4 p1, 0x0

    return-object p1

    .line 2161
    :cond_2
    invoke-virtual {p1, p2}, Ll/ۧܳ۠;->֫(Ljava/lang/String;)Ll/֫᩶۠;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ll/֫᩶۠;Ll/ᩳ᩶۠;)Ll/֫᩶۠;
    .locals 1

    .line 1158
    invoke-static {p1}, Ll/ۨܿ۠;->ܳ(Ll/֫᩶۠;)V

    .line 1159
    instance-of v0, p2, Ll/۫ܳ۠;

    if-eqz v0, :cond_1

    check-cast p2, Ll/۫ܳ۠;

    .line 1161
    iget-object p2, p2, Ll/۫ܳ۠;->ܽ:Ll/᩷۠ᩴ;

    invoke-static {p2}, Ll/᩹ܳ۠;->֫(Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;

    move-result-object p2

    .line 1163
    iget-object v0, p0, Ll/᩷ܿ۠;->ۛ:Ll/᩹ܳ۠;

    .line 2165
    invoke-virtual {v0, p1}, Ll/᩹ܳ۠;->֫(Ll/֫᩶۠;)Ll/ۧܳ۠;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 2166
    :cond_0
    invoke-virtual {p1, p2}, Ll/ۧܳ۠;->ۧ(Ll/᩷۠ᩴ;)Ll/֫᩶۠;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ܽ(Ll/֫᩶۠;)Ljava/lang/ClassLoader;
    .locals 7

    .line 742
    invoke-static {p1}, Ll/ۨܿ۠;->᩻(Ll/֫᩶۠;)V

    .line 1005
    iget-object v0, p0, Ll/᩷ܿ۠;->ۛ:Ll/᩹ܳ۠;

    .line 2134
    invoke-virtual {v0, p1}, Ll/᩹ܳ۠;->֫(Ll/֫᩶۠;)Ll/ۧܳ۠;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move-object p1, v0

    goto :goto_0

    .line 2135
    :cond_0
    invoke-virtual {p1}, Ll/ۧܳ۠;->ܽ()Ljava/util/Collection;

    move-result-object p1

    :goto_0
    if-nez p1, :cond_1

    move-object v1, v0

    goto :goto_1

    .line 1310
    :cond_1
    new-instance v1, Ll/ᩴܿ۠;

    invoke-direct {v1, p1}, Ll/ᩴܿ۠;-><init>(Ljava/util/Collection;)V

    :goto_1
    if-nez v1, :cond_2

    return-object v0

    .line 746
    :cond_2
    new-instance p1, Ll/ᩴܶ۠;

    invoke-direct {p1}, Ll/ᩴܶ۠;-><init>()V

    .line 747
    invoke-virtual {v1}, Ll/ᩴܿ۠;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    move-object v1, v0

    check-cast v1, Ll/ܶܿ۠;

    .line 1315
    iget-object v2, v1, Ll/ܶܿ۠;->᩸:Ljava/util/Iterator;

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 747
    invoke-virtual {v1}, Ll/ܶܿ۠;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/File;

    .line 749
    :try_start_0
    invoke-virtual {v1}, Ljava/io/File;->toURI()Ljava/net/URI;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/URI;->toURL()Ljava/net/URL;

    move-result-object v1

    invoke-virtual {p1, v1}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    .line 751
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 755
    :cond_3
    invoke-virtual {p1}, Ll/ᩴܶ۠;->size()I

    move-result v0

    new-array v0, v0, [Ljava/net/URL;

    invoke-virtual {p1, v0}, Ll/ᩴܶ۠;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/net/URL;

    .line 182
    const-class v0, Ljava/lang/ClassLoader;

    const-class v1, Ll/ۨܿ۠;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    .line 188
    iget-object v2, p0, Ll/᩷ܿ۠;->᩶:Ljava/lang/String;

    if-eqz v2, :cond_4

    .line 191
    :try_start_1
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v2

    const/4 v3, 0x2

    new-array v4, v3, [Ljava/lang/Class;

    .line 192
    const-class v5, [Ljava/net/URL;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    const/4 v5, 0x1

    aput-object v0, v4, v5

    .line 193
    invoke-virtual {v2, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    new-array v2, v3, [Ljava/lang/Object;

    aput-object p1, v2, v6

    aput-object v1, v2, v5

    .line 194
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ClassLoader;
    :try_end_1
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v0

    .line 199
    :catch_1
    :cond_4
    new-instance v0, Ljava/net/URLClassLoader;

    invoke-direct {v0, p1, v1}, Ljava/net/URLClassLoader;-><init>([Ljava/net/URL;Ljava/lang/ClassLoader;)V

    return-object v0
.end method

.method public final bridge synthetic ܿ(Ll/֫᩶۠;)Ljava/lang/Iterable;
    .locals 0

    .line 93
    invoke-virtual {p0, p1}, Ll/ۨܿ۠;->ܿ(Ll/֫᩶۠;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public final ܿ(Ll/֫᩶۠;)Ljava/util/Collection;
    .locals 1

    .line 506
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1011
    iget-object v0, p0, Ll/᩷ܿ۠;->ۛ:Ll/᩹ܳ۠;

    .line 2134
    invoke-virtual {v0, p1}, Ll/᩹ܳ۠;->֫(Ll/֫᩶۠;)Ll/ۧܳ۠;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 2135
    :cond_0
    invoke-virtual {p1}, Ll/ۧܳ۠;->ܽ()Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public final ᩳ(Ll/֫᩶۠;)Ljava/lang/String;
    .locals 1

    .line 1177
    invoke-static {p1}, Ll/ۨܿ۠;->᩻(Ll/֫᩶۠;)V

    .line 1178
    iget-object v0, p0, Ll/᩷ܿ۠;->ۛ:Ll/᩹ܳ۠;

    .line 2184
    invoke-virtual {v0, p1}, Ll/᩹ܳ۠;->֫(Ll/֫᩶۠;)Ll/ۧܳ۠;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 2185
    :cond_0
    invoke-virtual {p1}, Ll/ۧܳ۠;->ᩳ()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
