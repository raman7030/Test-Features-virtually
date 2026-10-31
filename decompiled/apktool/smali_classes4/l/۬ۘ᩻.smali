.class public final Ll/۬ۘ᩻;
.super Ll/ܿۜ᩻;
.source "6AF6"


# instance fields
.field public ۧ֫:Ll/ܽۜܳ;


# direct methods
.method public constructor <init>(Ll/ۨ᩻ۘ;Ljava/lang/String;)V
    .locals 10

    .line 16
    invoke-virtual {p1}, Ll/ۨ᩻ۘ;->ۧ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۨ᩻ۘ;->ܿ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Ll/ۨ᩻ۘ;->᩷()J

    move-result-wide v4

    invoke-virtual {p1}, Ll/ۨ᩻ۘ;->ۢ()J

    move-result-wide v6

    invoke-virtual {p1}, Ll/ۨ᩻ۘ;->ۡ()Z

    move-result v0

    const/4 v9, 0x1

    xor-int/lit8 v8, v0, 0x1

    move-object v0, p0

    move-object v2, p2

    .line 10
    invoke-direct/range {v0 .. v8}, Ll/ܺۘܳ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZ)V

    .line 17
    invoke-virtual {p1}, Ll/ۨ᩻ۘ;->֫()Ll/֫ۡۘ;

    move-result-object p2

    invoke-virtual {p2}, Ll/֫ۡۘ;->֫()I

    move-result p2

    and-int/lit8 p2, p2, 0x4

    if-eqz p2, :cond_6

    .line 18
    invoke-virtual {p1}, Ll/ۨ᩻ۘ;->᩻()Ljava/lang/String;

    move-result-object p1

    const-string p2, "\\s+"

    const/4 v0, 0x5

    invoke-virtual {p1, p2, v0}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p1

    .line 19
    array-length p2, p1

    if-ne p2, v0, :cond_6

    const/4 p2, 0x0

    .line 20
    aget-object v0, p1, p2

    const/4 v1, 0x2

    aget-object v1, p1, v1

    const/4 v2, 0x3

    aget-object p1, p1, v2

    .line 26
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0xa

    if-eq v2, v3, :cond_0

    goto :goto_1

    .line 31
    :cond_0
    :try_start_0
    invoke-virtual {v0, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/ۧ۠᩵;->֫(Ljava/lang/String;)I

    move-result v2
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    invoke-virtual {v0, p2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v3, 0x2d

    if-eq v0, v3, :cond_4

    const/16 v3, 0x6c

    if-eq v0, v3, :cond_3

    const/16 v3, 0x70

    if-eq v0, v3, :cond_2

    const/16 v3, 0x73

    if-eq v0, v3, :cond_1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/16 p2, 0x4000

    goto :goto_0

    :pswitch_1
    const/16 p2, 0x2000

    goto :goto_0

    :pswitch_2
    const/16 p2, 0x6000

    goto :goto_0

    :cond_1
    const p2, 0xc000

    goto :goto_0

    :cond_2
    const/16 p2, 0x1000

    goto :goto_0

    :cond_3
    const p2, 0xa000

    goto :goto_0

    :cond_4
    const p2, 0x8000

    :goto_0
    if-nez p2, :cond_5

    goto :goto_1

    :cond_5
    or-int/2addr p2, v2

    .line 43
    new-instance v0, Ll/ܽۜܳ;

    invoke-direct {v0, p2, v1, p1}, Ll/ܽۜܳ;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Ll/۬ۘ᩻;->ۧ֫:Ll/ܽۜܳ;

    :catch_0
    :cond_6
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x62
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final ֨ۧ()Ll/ܽۜܳ;
    .locals 1

    .line 48
    iget-object v0, p0, Ll/۬ۘ᩻;->ۧ֫:Ll/ܽۜܳ;

    return-object v0
.end method

.method public final ֫(Ll/ܽۜܳ;)V
    .locals 1

    .line 53
    iget-object v0, p0, Ll/۬ۘ᩻;->ۧ֫:Ll/ܽۜܳ;

    if-eqz v0, :cond_0

    .line 56
    iput-object p1, p0, Ll/۬ۘ᩻;->ۧ֫:Ll/ܽۜܳ;

    return-void

    .line 54
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method
