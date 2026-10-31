.class public final Ll/ᩳ֨ܳ;
.super Ll/᩶ۡۡ;
.source "QB4F"


# instance fields
.field public final synthetic ᩺:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 0

    .line 240
    iput-object p3, p0, Ll/ᩳ֨ܳ;->᩺:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p0, p1, p2}, Ll/᩶ۡۡ;-><init>(Landroid/content/Context;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/widget/TextView;Z)V
    .locals 0

    .line 243
    iget-object p2, p0, Ll/ᩳ֨ܳ;->᩺:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p2

    if-eqz p2, :cond_0

    sget p2, Ll/᩹֡᩷;->ܳ֫:I

    goto :goto_0

    :cond_0
    sget p2, Ll/᩹֡᩷;->᩻֫:I

    :goto_0
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method
