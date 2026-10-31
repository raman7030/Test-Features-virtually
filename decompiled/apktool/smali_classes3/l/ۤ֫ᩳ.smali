.class public final Ll/ۤ֫ᩳ;
.super Ljava/lang/Object;
.source "L58U"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:Ljava/lang/String;

.field public final synthetic ᩸:Ll/᩺֫ᩳ;

.field public final synthetic ᩹:Ll/ۗ֫ᩳ;


# direct methods
.method public constructor <init>(Ll/᩺֫ᩳ;Ll/ۗ֫ᩳ;Ljava/lang/String;)V
    .locals 0

    .line 260
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤ֫ᩳ;->᩸:Ll/᩺֫ᩳ;

    iput-object p2, p0, Ll/ۤ֫ᩳ;->᩹:Ll/ۗ֫ᩳ;

    iput-object p3, p0, Ll/ۤ֫ᩳ;->᩶:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 278
    iget-object v0, p0, Ll/ۤ֫ᩳ;->᩸:Ll/᩺֫ᩳ;

    invoke-static {v0}, Ll/᩺֫ᩳ;->ܳ(Ll/᩺֫ᩳ;)Ll/֡ۚۢ;

    move-result-object v1

    if-nez v1, :cond_0

    .line 279
    invoke-static {v0}, Ll/᩺֫ᩳ;->᩷(Ll/᩺֫ᩳ;)V

    .line 280
    :cond_0
    invoke-static {v0}, Ll/᩺֫ᩳ;->ۜ(Ll/᩺֫ᩳ;)Landroid/widget/TextView;

    move-result-object v1

    iget-object v2, p0, Ll/ۤ֫ᩳ;->᩹:Ll/ۗ֫ᩳ;

    iget-object v3, v2, Ll/ۗ֫ᩳ;->ۧ:Ljava/lang/String;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 281
    invoke-static {v0}, Ll/᩺֫ᩳ;->ܿ(Ll/᩺֫ᩳ;)Landroid/widget/TextView;

    move-result-object v1

    iget-object v2, v2, Ll/ۗ֫ᩳ;->֫:Ljava/lang/String;

    const-string v3, "\n"

    .line 264
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v4, "\n->"

    .line 265
    invoke-virtual {v2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_1
    const-string v4, " ->"

    .line 267
    invoke-virtual {v2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 268
    :goto_0
    iget-object v4, p0, Ll/ۤ֫ᩳ;->᩶:Ljava/lang/String;

    invoke-virtual {v4, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_1

    :cond_2
    const-string v3, " "

    .line 0
    :goto_1
    invoke-static {v2, v3}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 272
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 281
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 282
    invoke-static {v0}, Ll/᩺֫ᩳ;->ܳ(Ll/᩺֫ᩳ;)Ll/֡ۚۢ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֡ۚۢ;->᩷()V

    return-void
.end method
