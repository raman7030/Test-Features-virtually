.class public final Ll/ۢ֫۠;
.super Ll/ۢܽ۠;
.source "A451"


# instance fields
.field public final synthetic ۧ:Ll/᩹ܽ۠;


# direct methods
.method public constructor <init>(Ll/᩹ܽ۠;)V
    .locals 0

    .line 3312
    iput-object p1, p0, Ll/ۢ֫۠;->ۧ:Ll/᩹ܽ۠;

    invoke-direct {p0, p1}, Ll/ۢܽ۠;-><init>(Ll/᩹ܽ۠;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩵ܽ۠;)Ll/᩵ܽ۠;
    .locals 3

    .line 3316
    invoke-virtual {p1}, Ll/᩵ܽ۠;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Ll/ᩴܽ۠;->᩶:Ll/ᩴܽ۠;

    invoke-virtual {p1, v0}, Ll/᩵ܽ۠;->֫(Ll/ᩴܽ۠;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 3318
    :cond_0
    new-instance v0, Ll/֫ۧ۠;

    iget-object p1, p1, Ll/᩵ܽ۠;->ۧ:Ll/ۛ֡֨;

    const/4 v1, 0x0

    iget-object v2, p0, Ll/ۢ֫۠;->ۧ:Ll/᩹ܽ۠;

    invoke-direct {v0, v2, p1, v1}, Ll/֫ۧ۠;-><init>(Ll/᩹ܽ۠;Ll/ۛ֡֨;Z)V

    invoke-static {v0}, Ll/᩵ܽ۠;->֫(Ll/ۛ֡֨;)Ll/᩵ܽ۠;

    move-result-object p1

    :cond_1
    :goto_0
    return-object p1
.end method

.method public final ֫(Ll/᩵ܽ۠;Ll/᩵ܽ۠;)Ll/᩵ܽ۠;
    .locals 4

    .line 3323
    invoke-virtual {p1}, Ll/᩵ܽ۠;->ۧ()Z

    move-result v0

    iget-object v1, p1, Ll/᩵ܽ۠;->ۧ:Ll/ۛ֡֨;

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Ll/ۛ֡֨;->֡֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3324
    invoke-virtual {p2}, Ll/᩵ܽ۠;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Ll/ᩴܽ۠;->ۙ:Ll/ᩴܽ۠;

    invoke-virtual {p2, v0}, Ll/᩵ܽ۠;->֫(Ll/ᩴܽ۠;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 3328
    :cond_0
    invoke-virtual {p2}, Ll/᩵ܽ۠;->ۧ()Z

    move-result v0

    iget-object v2, p2, Ll/᩵ܽ۠;->ۧ:Ll/ۛ֡֨;

    if-eqz v0, :cond_1

    invoke-virtual {v2}, Ll/ۛ֡֨;->֡֫()Z

    move-result v0

    if-nez v0, :cond_1

    .line 3329
    invoke-virtual {p1}, Ll/᩵ܽ۠;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Ll/ᩴܽ۠;->᩶:Ll/ᩴܽ۠;

    invoke-virtual {p1, v0}, Ll/᩵ܽ۠;->֫(Ll/ᩴܽ۠;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 3333
    :cond_1
    invoke-virtual {p1}, Ll/᩵ܽ۠;->ۧ()Z

    move-result v0

    iget-object v3, p0, Ll/ۢ֫۠;->ۧ:Ll/᩹ܽ۠;

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Ll/᩵ܽ۠;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3335
    invoke-virtual {v3, v1, v2}, Ll/᩹ܽ۠;->֫(Ll/ۛ֡֨;Ll/ۛ֡֨;)Ll/ۛ֡֨;

    move-result-object p1

    invoke-static {p1}, Ll/᩵ܽ۠;->֫(Ll/ۛ֡֨;)Ll/᩵ܽ۠;

    move-result-object p1

    return-object p1

    .line 3336
    :cond_2
    invoke-virtual {p1}, Ll/᩵ܽ۠;->ۧ()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p2}, Ll/᩵ܽ۠;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_2

    .line 3345
    :cond_3
    invoke-virtual {p1}, Ll/᩵ܽ۠;->֫()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p2}, Ll/᩵ܽ۠;->֫()Z

    move-result v0

    if-nez v0, :cond_5

    :cond_4
    :goto_0
    return-object p2

    :cond_5
    :goto_1
    return-object p1

    .line 3341
    :cond_6
    :goto_2
    new-instance p2, Ll/֫ۧ۠;

    invoke-virtual {p1}, Ll/᩵ܽ۠;->ۧ()Z

    move-result p1

    if-eqz p1, :cond_7

    goto :goto_3

    :cond_7
    move-object v1, v2

    :goto_3
    const/4 p1, 0x1

    .line 3342
    invoke-direct {p2, v3, v1, p1}, Ll/֫ۧ۠;-><init>(Ll/᩹ܽ۠;Ll/ۛ֡֨;Z)V

    .line 3341
    invoke-static {p2}, Ll/᩵ܽ۠;->֫(Ll/ۛ֡֨;)Ll/᩵ܽ۠;

    move-result-object p1

    return-object p1
.end method
