.class public final enum Ll/ܺۢܺ;
.super Ll/۠ۢܺ;
.source "VBIK"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "FORMAT_FILL_ARRAY_DATA_PAYLOAD"

    const/16 v1, 0x23

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ܺۢܺ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 823
    invoke-direct {p0, p1, p2, v0}, Ll/۠ۢܺ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(ILl/ܺ᩷ܺ;)Ll/ۘ᩷ܺ;
    .locals 7

    .line 827
    invoke-interface {p2}, Ll/ܺ᩷ܺ;->read()I

    move-result v0

    .line 828
    invoke-interface {p2}, Ll/ܺ᩷ܺ;->readInt()I

    move-result v1

    const/16 v2, 0x8

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v0, v4, :cond_6

    const/4 v4, 0x2

    if-eq v0, v4, :cond_4

    const/4 v4, 0x4

    if-eq v0, v4, :cond_2

    if-ne v0, v2, :cond_1

    .line 861
    new-array v0, v1, [J

    :goto_0
    if-ge v3, v1, :cond_0

    .line 863
    invoke-interface {p2}, Ll/ܺ᩷ܺ;->readLong()J

    move-result-wide v4

    aput-wide v4, v0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 865
    :cond_0
    new-instance p2, Ll/ᩴ᩷ܺ;

    invoke-direct {p2, p0, p1, v0}, Ll/ᩴ᩷ܺ;-><init>(Ll/۠ۢܺ;I[J)V

    return-object p2

    .line 871
    :cond_1
    new-instance p1, Ll/֡ۧܺ;

    .line 872
    invoke-static {v0}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object p2

    const-string v0, "bogus element_width: "

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    .line 60
    invoke-direct {p1, p2, v0}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 872
    throw p1

    .line 853
    :cond_2
    new-array v0, v1, [I

    :goto_1
    if-ge v3, v1, :cond_3

    .line 855
    invoke-interface {p2}, Ll/ܺ᩷ܺ;->readInt()I

    move-result v2

    aput v2, v0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 857
    :cond_3
    new-instance p2, Ll/ᩴ᩷ܺ;

    invoke-direct {p2, p0, p1, v0}, Ll/ᩴ᩷ܺ;-><init>(Ll/۠ۢܺ;I[I)V

    return-object p2

    .line 845
    :cond_4
    new-array v0, v1, [S

    :goto_2
    if-ge v3, v1, :cond_5

    .line 847
    invoke-interface {p2}, Ll/ܺ᩷ܺ;->read()I

    move-result v2

    int-to-short v2, v2

    aput-short v2, v0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 849
    :cond_5
    new-instance p2, Ll/ᩴ᩷ܺ;

    invoke-direct {p2, p0, p1, v0}, Ll/ᩴ᩷ܺ;-><init>(Ll/۠ۢܺ;I[S)V

    return-object p2

    .line 832
    :cond_6
    new-array v0, v1, [B

    const/4 v4, 0x0

    const/4 v5, 0x1

    :goto_3
    if-ge v3, v1, :cond_8

    if-eqz v5, :cond_7

    .line 836
    invoke-interface {p2}, Ll/ܺ᩷ܺ;->read()I

    move-result v4

    :cond_7
    and-int/lit16 v6, v4, 0xff

    int-to-byte v6, v6

    .line 838
    aput-byte v6, v0, v3

    shr-int/2addr v4, v2

    add-int/lit8 v3, v3, 0x1

    xor-int/lit8 v5, v5, 0x1

    goto :goto_3

    .line 841
    :cond_8
    new-instance p2, Ll/ᩴ᩷ܺ;

    invoke-direct {p2, p0, p1, v0}, Ll/ᩴ᩷ܺ;-><init>(Ll/۠ۢܺ;I[B)V

    return-object p2
.end method

.method public ֫(Ll/ۘ᩷ܺ;Ll/ۖ᩷ܺ;)V
    .locals 2

    .line 877
    check-cast p1, Ll/ᩴ᩷ܺ;

    .line 879
    invoke-virtual {p1}, Ll/ᩴ᩷ܺ;->֡()S

    move-result v0

    .line 880
    invoke-virtual {p1}, Ll/ᩴ᩷ܺ;->᩵()Ljava/lang/Object;

    move-result-object p1

    .line 882
    invoke-interface {p2}, Ll/ۖ᩷ܺ;->֫()V

    .line 883
    invoke-interface {p2}, Ll/ۖ᩷ܺ;->֫()V

    .line 884
    invoke-interface {p2}, Ll/ۖ᩷ܺ;->ۡ()V

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    .line 897
    check-cast p1, [J

    invoke-interface {p2}, Ll/ۖ᩷ܺ;->ۜ()V

    return-void

    .line 900
    :cond_0
    new-instance p1, Ll/֡ۧܺ;

    .line 901
    invoke-static {v0}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object p2

    const-string v0, "bogus element_width: "

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    .line 60
    invoke-direct {p1, p2, v0}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 901
    throw p1

    .line 894
    :cond_1
    check-cast p1, [I

    invoke-interface {p2}, Ll/ۖ᩷ܺ;->᩻()V

    return-void

    .line 891
    :cond_2
    check-cast p1, [S

    invoke-interface {p2}, Ll/ۖ᩷ܺ;->ܳ()V

    return-void

    .line 888
    :cond_3
    check-cast p1, [B

    invoke-interface {p2}, Ll/ۖ᩷ܺ;->ܿ()V

    return-void
.end method
