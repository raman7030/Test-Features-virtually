.class public final Ll/ᩳۤۚ;
.super Ljava/lang/Object;
.source "R7EK"


# static fields
.field public static final ֫:Ljava/util/HashMap;

.field public static final ۜ:Ljava/util/HashMap;

.field public static final ۧ:Ljava/util/HashMap;

.field public static final ܳ:Ljava/util/HashMap;

.field public static final ܽ:Ljava/util/HashMap;

.field public static final ܿ:Ljava/util/HashMap;

.field public static final ᩳ:Ljava/util/HashMap;

.field public static final ᩻:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 44
    new-instance v0, Ljava/util/HashMap;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    sput-object v0, Ll/ᩳۤۚ;->᩻:Ljava/util/HashMap;

    .line 45
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    sput-object v0, Ll/ᩳۤۚ;->ۜ:Ljava/util/HashMap;

    .line 47
    new-instance v0, Ljava/util/HashMap;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    sput-object v0, Ll/ᩳۤۚ;->ܿ:Ljava/util/HashMap;

    .line 48
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    sput-object v0, Ll/ᩳۤۚ;->ܽ:Ljava/util/HashMap;

    .line 50
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    sput-object v0, Ll/ᩳۤۚ;->֫:Ljava/util/HashMap;

    .line 52
    new-instance v0, Ljava/util/HashMap;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    sput-object v0, Ll/ᩳۤۚ;->ܳ:Ljava/util/HashMap;

    .line 53
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    sput-object v0, Ll/ᩳۤۚ;->ۧ:Ljava/util/HashMap;

    .line 54
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    sput-object v0, Ll/ᩳۤۚ;->ᩳ:Ljava/util/HashMap;

    .line 58
    invoke-static {}, Ll/ۧۤۚ;->values()[Ll/ۧۤۚ;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    aget-object v4, v0, v3

    .line 92
    sget-object v5, Ll/ᩳۤۚ;->ܳ:Ljava/util/HashMap;

    invoke-static {v4}, Ll/ۧۤۚ;->ܽ(Ll/ۧۤۚ;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    invoke-static {v4}, Ll/ۧۤۚ;->ۧ(Ll/ۧۤۚ;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 94
    sget-object v5, Ll/ᩳۤۚ;->ۧ:Ljava/util/HashMap;

    invoke-static {v4}, Ll/ۧۤۚ;->ܽ(Ll/ۧۤۚ;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    :cond_0
    sget-object v5, Ll/ᩳۤۚ;->ᩳ:Ljava/util/HashMap;

    invoke-static {v4}, Ll/ۧۤۚ;->ᩳ(Ll/ۧۤۚ;)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    .line 98
    invoke-static {v4}, Ll/ۧۤۚ;->ᩳ(Ll/ۧۤۚ;)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 63
    :cond_2
    invoke-static {}, Ll/ܽۤۚ;->values()[Ll/ܽۤۚ;

    move-result-object v0

    array-length v1, v0

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v1, :cond_3

    aget-object v4, v0, v3

    .line 103
    sget-object v5, Ll/ᩳۤۚ;->᩻:Ljava/util/HashMap;

    invoke-static {v4}, Ll/ܽۤۚ;->֫(Ll/ܽۤۚ;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    sget-object v5, Ll/ᩳۤۚ;->ۜ:Ljava/util/HashMap;

    invoke-static {v4}, Ll/ܽۤۚ;->ۧ(Ll/ܽۤۚ;)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 68
    :cond_3
    invoke-static {}, Ll/֫ۤۚ;->values()[Ll/֫ۤۚ;

    move-result-object v0

    array-length v1, v0

    const/4 v3, 0x0

    :goto_2
    if-ge v3, v1, :cond_4

    aget-object v4, v0, v3

    .line 116
    sget-object v5, Ll/ᩳۤۚ;->ܿ:Ljava/util/HashMap;

    invoke-static {v4}, Ll/֫ۤۚ;->֫(Ll/֫ۤۚ;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    sget-object v5, Ll/ᩳۤۚ;->ܽ:Ljava/util/HashMap;

    invoke-static {v4}, Ll/֫ۤۚ;->ۧ(Ll/֫ۤۚ;)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 73
    :cond_4
    invoke-static {}, Ll/۟۫ۚ;->values()[Ll/۟۫ۚ;

    move-result-object v0

    array-length v1, v0

    const/4 v3, 0x0

    :goto_3
    if-ge v3, v1, :cond_5

    aget-object v4, v0, v3

    .line 139
    sget-object v5, Ll/ᩳۤۚ;->֫:Ljava/util/HashMap;

    invoke-static {v4}, Ll/۟۫ۚ;->ۧ(Ll/۟۫ۚ;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v2}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-static {v6}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v6

    invoke-virtual {v5, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_5
    return-void
.end method

.method public static ֫(Ljava/lang/String;)I
    .locals 1

    .line 130
    sget-object v0, Ll/ᩳۤۚ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/֫ۤۚ;

    if-eqz p0, :cond_0

    .line 132
    invoke-static {p0}, Ll/֫ۤۚ;->ۧ(Ll/֫ۤۚ;)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    :cond_0
    const/4 p0, -0x1

    return p0
.end method

.method public static ֫(I)Ll/֫ۤۚ;
    .locals 1

    .line 125
    sget-object v0, Ll/ᩳۤۚ;->ܽ:Ljava/util/HashMap;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/֫ۤۚ;

    return-object p0
.end method

.method public static ֫(C)Ll/۟۫ۚ;
    .locals 1

    .line 143
    sget-object v0, Ll/ᩳۤۚ;->֫:Ljava/util/HashMap;

    invoke-static {p0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/۟۫ۚ;

    if-nez p0, :cond_0

    .line 145
    sget-object p0, Ll/۟۫ۚ;->ܿ֫:Ll/۟۫ۚ;

    :cond_0
    return-object p0
.end method

.method public static ۧ(I)Ll/ۧۤۚ;
    .locals 1

    .line 79
    sget-object v0, Ll/ᩳۤۚ;->ᩳ:Ljava/util/HashMap;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۧۤۚ;

    if-nez p0, :cond_0

    .line 80
    sget-object p0, Ll/ۧۤۚ;->۫֫:Ll/ۧۤۚ;

    :cond_0
    return-object p0
.end method

.method public static ۧ(Ljava/lang/String;)Ll/ۧۤۚ;
    .locals 1

    .line 88
    sget-object v0, Ll/ᩳۤۚ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۧۤۚ;

    return-object p0
.end method

.method public static ܽ(Ljava/lang/String;)Ll/֫ۤۚ;
    .locals 1

    .line 121
    sget-object v0, Ll/ᩳۤۚ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/֫ۤۚ;

    return-object p0
.end method

.method public static ܽ(I)Ll/ܽۤۚ;
    .locals 1

    .line 112
    sget-object v0, Ll/ᩳۤۚ;->ۜ:Ljava/util/HashMap;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܽۤۚ;

    return-object p0
.end method

.method public static ܿ(Ljava/lang/String;)Ll/ܽۤۚ;
    .locals 1

    .line 108
    sget-object v0, Ll/ᩳۤۚ;->᩻:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܽۤۚ;

    return-object p0
.end method

.method public static ᩳ(Ljava/lang/String;)Ll/ۧۤۚ;
    .locals 1

    .line 84
    sget-object v0, Ll/ᩳۤۚ;->ܳ:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۧۤۚ;

    return-object p0
.end method
