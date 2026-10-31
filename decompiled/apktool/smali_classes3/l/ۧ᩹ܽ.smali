.class public final synthetic Ll/ۧ᩹ܽ;
.super Ljava/lang/Object;
.source "P676"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ۗ:Z

.field public final synthetic ۙ:I

.field public final synthetic ᩶:Ll/᩺ܶ֡;

.field public final synthetic ᩸:Ll/᩷᩶ܽ;

.field public final synthetic ᩹:[I


# direct methods
.method public synthetic constructor <init>(Ll/᩷᩶ܽ;[ILl/᩺ܶ֡;IZ)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧ᩹ܽ;->᩸:Ll/᩷᩶ܽ;

    iput-object p2, p0, Ll/ۧ᩹ܽ;->᩹:[I

    iput-object p3, p0, Ll/ۧ᩹ܽ;->᩶:Ll/᩺ܶ֡;

    iput p4, p0, Ll/ۧ᩹ܽ;->ۙ:I

    iput-boolean p5, p0, Ll/ۧ᩹ܽ;->ۗ:Z

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .line 2
    sget-boolean p1, Ll/᩷᩶ܽ;->ܺۧ:Z

    .line 1142
    iget-object p1, p0, Ll/ۧ᩹ܽ;->᩹:[I

    aget p1, p1, p2

    const p2, 0x7f120388

    .line 1143
    iget-object v0, p0, Ll/ۧ᩹ܽ;->᩸:Ll/᩷᩶ܽ;

    iget-object v1, p0, Ll/ۧ᩹ܽ;->᩶:Ll/᩺ܶ֡;

    iget v2, p0, Ll/ۧ᩹ܽ;->ۙ:I

    if-ne p1, p2, :cond_0

    .line 1144
    new-instance p1, Ll/ܽ᩶ܽ;

    invoke-direct {p1, v0}, Ll/ܽ᩶ܽ;-><init>(Ll/᩷᩶ܽ;)V

    invoke-virtual {p1, v2, v1}, Ll/ܽ᩶ܽ;->֫(ILl/᩺ܶ֡;)V

    return-void

    :cond_0
    const p2, 0x7f120872

    if-ne p1, p2, :cond_1

    .line 1147
    sget p1, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance p1, Ll/᩵ۚۢ;

    invoke-direct {p1, v0}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    const p2, 0x7f120878

    .line 1148
    invoke-virtual {p1, p2}, Ll/᩵ۚۢ;->ۧ(I)V

    iget-object p2, v1, Ll/᩺ܶ֡;->᩹:Ll/ᩴۙ֡;

    iget-object p2, p2, Ll/ᩴۙ֡;->۬:Ll/ۨۙ֡;

    .line 1149
    invoke-virtual {p2}, Ll/ۨۙ֡;->᩻()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance p2, Ll/ᩳ᩹ܽ;

    iget-boolean v1, p0, Ll/ۧ᩹ܽ;->ۗ:Z

    invoke-direct {p2, v0, v1, v2}, Ll/ᩳ᩹ܽ;-><init>(Ll/᩷᩶ܽ;ZI)V

    const v0, 0x7f12070a

    .line 1150
    invoke-virtual {p1, v0, p2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p2, 0x7f12015e

    const/4 v0, 0x0

    .line 1164
    invoke-virtual {p1, p2, v0}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 1165
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    :cond_1
    return-void
.end method
