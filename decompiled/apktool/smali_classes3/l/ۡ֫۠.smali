.class public final Ll/ۡ֫۠;
.super Ll/ۢܽ۠;
.source "A451"


# instance fields
.field public final synthetic ۧ:Ll/᩹ܽ۠;


# direct methods
.method public constructor <init>(Ll/᩹ܽ۠;)V
    .locals 0

    .line 3355
    iput-object p1, p0, Ll/ۡ֫۠;->ۧ:Ll/᩹ܽ۠;

    invoke-direct {p0, p1}, Ll/ۢܽ۠;-><init>(Ll/᩹ܽ۠;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩵ܽ۠;)Ll/᩵ܽ۠;
    .locals 3

    .line 3359
    invoke-virtual {p1}, Ll/᩵ܽ۠;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Ll/ᩴܽ۠;->ۙ:Ll/ᩴܽ۠;

    invoke-virtual {p1, v0}, Ll/᩵ܽ۠;->֫(Ll/ᩴܽ۠;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 3361
    :cond_0
    new-instance v0, Ll/֫ۧ۠;

    iget-object p1, p1, Ll/᩵ܽ۠;->ۧ:Ll/ۛ֡֨;

    const/4 v1, 0x0

    iget-object v2, p0, Ll/ۡ֫۠;->ۧ:Ll/᩹ܽ۠;

    invoke-direct {v0, v2, p1, v1}, Ll/֫ۧ۠;-><init>(Ll/᩹ܽ۠;Ll/ۛ֡֨;Z)V

    invoke-static {v0}, Ll/᩵ܽ۠;->֫(Ll/ۛ֡֨;)Ll/᩵ܽ۠;

    move-result-object p1

    :cond_1
    :goto_0
    return-object p1
.end method

.method public final ֫(Ll/᩵ܽ۠;Ll/᩵ܽ۠;)Ll/᩵ܽ۠;
    .locals 2

    .line 3366
    invoke-virtual {p1}, Ll/᩵ܽ۠;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ll/ᩴܽ۠;->᩶:Ll/ᩴܽ۠;

    invoke-virtual {p1, v0}, Ll/᩵ܽ۠;->֫(Ll/ᩴܽ۠;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 3369
    :cond_0
    invoke-virtual {p2}, Ll/᩵ܽ۠;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Ll/ᩴܽ۠;->ۙ:Ll/ᩴܽ۠;

    invoke-virtual {p2, v0}, Ll/᩵ܽ۠;->֫(Ll/ᩴܽ۠;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 3372
    :cond_1
    invoke-virtual {p1}, Ll/᩵ܽ۠;->ۧ()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p2}, Ll/᩵ܽ۠;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_2

    .line 3379
    :cond_2
    invoke-virtual {p1}, Ll/᩵ܽ۠;->֫()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p2}, Ll/᩵ܽ۠;->֫()Z

    move-result v0

    if-nez v0, :cond_3

    :goto_0
    return-object p2

    :cond_3
    :goto_1
    return-object p1

    .line 3375
    :cond_4
    :goto_2
    new-instance v0, Ll/֫ۧ۠;

    invoke-virtual {p1}, Ll/᩵ܽ۠;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 3376
    iget-object p1, p1, Ll/᩵ܽ۠;->ۧ:Ll/ۛ֡֨;

    goto :goto_3

    :cond_5
    iget-object p1, p2, Ll/᩵ܽ۠;->ۧ:Ll/ۛ֡֨;

    :goto_3
    const/4 p2, 0x1

    iget-object v1, p0, Ll/ۡ֫۠;->ۧ:Ll/᩹ܽ۠;

    invoke-direct {v0, v1, p1, p2}, Ll/֫ۧ۠;-><init>(Ll/᩹ܽ۠;Ll/ۛ֡֨;Z)V

    .line 3375
    invoke-static {v0}, Ll/᩵ܽ۠;->֫(Ll/ۛ֡֨;)Ll/᩵ܽ۠;

    move-result-object p1

    return-object p1
.end method
