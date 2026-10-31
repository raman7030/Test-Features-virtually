.class public final enum Ll/ۧܽ۠;
.super Ll/ܽܽ۠;
.source "A451"


# direct methods
.method public synthetic constructor <init>()V
    .locals 3

    const/4 v0, 0x2

    const/4 v1, 0x1

    const-string v2, "VARARITY"

    .line 0
    invoke-direct {p0, v2, v0, v1, v1}, Ll/ۧܽ۠;-><init>(Ljava/lang/String;IZZ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IZZ)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    .line 4870
    invoke-direct/range {v0 .. v5}, Ll/ܽܽ۠;-><init>(Ljava/lang/String;IZZI)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ۛ֡֨;Ll/ۛ֡֨;)Ll/ۛ֡֨;
    .locals 5

    .line 4874
    iget-object v0, p1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    invoke-virtual {v0}, Ll/֨ᩴ֨;->ۧ()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v2, Ll/֨ᩴ֨;->ۛ:Ll/֨ᩴ֨;

    if-eq v0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/۫ۙ;->֫(Z)V

    .line 4875
    iget-object v0, p2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    invoke-virtual {v0}, Ll/֨ᩴ֨;->ۧ()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 4880
    :cond_1
    sget-object v0, Ll/ܺ֫۠;->֫:[I

    iget-object v2, p1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v0, v2

    const/4 v3, 0x3

    if-eq v2, v3, :cond_2

    const/4 v4, 0x6

    if-eq v2, v4, :cond_2

    goto :goto_2

    .line 4887
    :cond_2
    iget-object v2, p2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v0, v0, v2

    if-eq v0, v1, :cond_5

    if-eq v0, v3, :cond_3

    goto :goto_1

    .line 4891
    :cond_3
    iget-object v0, p1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v1, Ll/֨ᩴ֨;->ۢ֫:Ll/֨ᩴ֨;

    if-ne v0, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    return-object p2

    :cond_5
    :goto_2
    return-object p1
.end method
