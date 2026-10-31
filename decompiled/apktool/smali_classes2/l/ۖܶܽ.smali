.class public final Ll/ۖܶܽ;
.super Ll/ܿ۬ܿ;
.source "4646"


# instance fields
.field public final synthetic ᩳ:Ll/۠ܶܽ;


# direct methods
.method public constructor <init>(Ll/۠ܶܽ;Ll/۠ܶܽ;Z)V
    .locals 0

    .line 170
    iput-object p1, p0, Ll/ۖܶܽ;->ᩳ:Ll/۠ܶܽ;

    invoke-direct {p0, p2, p3}, Ll/ܿ۬ܿ;-><init>(Ll/ۗܺ᩷;Z)V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 188
    iget-object v0, p0, Ll/ۖܶܽ;->ᩳ:Ll/۠ܶܽ;

    invoke-static {v0}, Ll/۠ܶܽ;->ᩳ(Ll/۠ܶܽ;)Ll/֨ܶܽ;

    move-result-object v1

    const/4 v2, 0x0

    iput-boolean v2, v1, Ll/֨ܶܽ;->ۨ:Z

    .line 189
    invoke-static {v0}, Ll/۠ܶܽ;->ᩳ(Ll/۠ܶܽ;)Ll/֨ܶܽ;

    move-result-object v1

    iget-object v1, v1, Ll/֨ܶܽ;->۫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    .line 190
    invoke-static {v0}, Ll/۠ܶܽ;->ۧ(Ll/۠ܶܽ;)Ll/۫᩵ۘ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۙ᩵ۘ;->notifyDataSetChanged()V

    return-void
.end method

.method public final ֫(Ll/ᩳ۬ܿ;Ljava/lang/String;)V
    .locals 9

    .line 174
    iget-object v0, p0, Ll/ۖܶܽ;->ᩳ:Ll/۠ܶܽ;

    invoke-static {v0}, Ll/۠ܶܽ;->ᩳ(Ll/۠ܶܽ;)Ll/֨ܶܽ;

    move-result-object v1

    const/4 v2, 0x1

    iput-boolean v2, v1, Ll/֨ܶܽ;->ۨ:Z

    .line 175
    invoke-static {v0}, Ll/۠ܶܽ;->ᩳ(Ll/۠ܶܽ;)Ll/֨ܶܽ;

    move-result-object v1

    const/4 v3, 0x0

    iput v3, v1, Ll/֨ܶܽ;->ۛ:I

    .line 176
    invoke-static {v0}, Ll/۠ܶܽ;->ᩳ(Ll/۠ܶܽ;)Ll/֨ܶܽ;

    move-result-object v1

    iget-object v1, v1, Ll/֨ܶܽ;->ۗ:Ll/ܶۨۡ;

    iget-object v1, v1, Ll/ܶۨۡ;->ܿ:Ll/۬ܿܽ;

    invoke-virtual {v1}, Ll/۬ܿܽ;->size()I

    move-result v1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_1

    .line 177
    invoke-static {v0}, Ll/۠ܶܽ;->ᩳ(Ll/۠ܶܽ;)Ll/֨ܶܽ;

    move-result-object v5

    iget-object v5, v5, Ll/֨ܶܽ;->ۗ:Ll/ܶۨۡ;

    iget-object v5, v5, Ll/ܶۨۡ;->ܿ:Ll/۬ܿܽ;

    invoke-virtual {v5, v4}, Ll/᩷ܿܽ;->ۧ(I)Ljava/lang/String;

    move-result-object v5

    .line 178
    invoke-virtual {p1, v5}, Ll/ᩳ۬ܿ;->֫(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 179
    invoke-static {v0}, Ll/۠ܶܽ;->ᩳ(Ll/۠ܶܽ;)Ll/֨ܶܽ;

    move-result-object v5

    iget-object v5, v5, Ll/֨ܶܽ;->ۤ:[I

    invoke-static {v0}, Ll/۠ܶܽ;->ᩳ(Ll/۠ܶܽ;)Ll/֨ܶܽ;

    move-result-object v6

    iget v7, v6, Ll/֨ܶܽ;->ۛ:I

    add-int/lit8 v8, v7, 0x1

    iput v8, v6, Ll/֨ܶܽ;->ۛ:I

    aput v4, v5, v7

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    new-array p1, v2, [Ljava/lang/Object;

    aput-object p2, p1, v3

    const p2, 0x7f1203de

    .line 182
    invoke-virtual {v0, p2, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    .line 183
    invoke-static {v0}, Ll/۠ܶܽ;->ۧ(Ll/۠ܶܽ;)Ll/۫᩵ۘ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۙ᩵ۘ;->notifyDataSetChanged()V

    return-void
.end method
