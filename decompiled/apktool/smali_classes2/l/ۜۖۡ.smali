.class public final synthetic Ll/ۜۖۡ;
.super Ljava/lang/Object;
.source "T8W7"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/᩷ۖۡ;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(Ll/᩷ۖۡ;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜۖۡ;->᩸:Ll/᩷ۖۡ;

    iput p2, p0, Ll/ۜۖۡ;->᩹:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 264
    iget-object p1, p0, Ll/ۜۖۡ;->᩸:Ll/᩷ۖۡ;

    iget-object p1, p1, Ll/᩷ۖۡ;->᩶:Ll/ۢۖۡ;

    invoke-static {p1}, Ll/ۢۖۡ;->ۧ(Ll/ۢۖۡ;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/ArrayList;

    iget v0, p0, Ll/ۜۖۡ;->᩹:I

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 265
    invoke-static {p1}, Ll/ۢۖۡ;->֫(Ll/ۢۖۡ;)Ll/ܳۖۡ;

    move-result-object p1

    invoke-virtual {p1, v0}, Ll/᩶ۗۧ;->notifyItemRemoved(I)V

    .line 266
    sget p1, Ll/֫ۖۡ;->֫:I

    .line 59
    new-instance p1, Ll/ᩴܶ᩷;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Ll/ᩴܶ᩷;-><init>(I)V

    const-class p2, Ll/֫ۖۡ;

    const-wide/16 v0, 0x1f4

    invoke-static {p1, p2, v0, v1}, Ll/֫ۨۡ;->֫(Ljava/lang/Runnable;Ljava/lang/Object;J)V

    return-void
.end method
