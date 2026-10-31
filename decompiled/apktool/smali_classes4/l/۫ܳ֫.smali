.class public final Ll/۫ܳ֫;
.super Ll/ܶ᩻֫;
.source "Z4K7"


# instance fields
.field public final synthetic ֫:Ll/ۤܳ֫;

.field public final synthetic ۧ:Ll/ܶ᩻֫;


# direct methods
.method public constructor <init>(Ll/ۤܳ֫;Ll/ܶ᩻֫;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 527
    iput-object p1, p0, Ll/۫ܳ֫;->֫:Ll/ۤܳ֫;

    iput-object p2, p0, Ll/۫ܳ֫;->ۧ:Ll/ܶ᩻֫;

    return-void
.end method


# virtual methods
.method public final ֫(I)Landroid/view/View;
    .locals 2

    .line 531
    iget-object v0, p0, Ll/۫ܳ֫;->ۧ:Ll/ܶ᩻֫;

    invoke-virtual {v0}, Ll/ܶ᩻֫;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 532
    invoke-virtual {v0, p1}, Ll/ܶ᩻֫;->֫(I)Landroid/view/View;

    move-result-object p1

    return-object p1

    .line 534
    :cond_0
    iget-object v0, p0, Ll/۫ܳ֫;->֫:Ll/ۤܳ֫;

    invoke-virtual {v0, p1}, Ll/ۤܳ֫;->onFindViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ()Z
    .locals 1

    .line 539
    iget-object v0, p0, Ll/۫ܳ֫;->ۧ:Ll/ܶ᩻֫;

    invoke-virtual {v0}, Ll/ܶ᩻֫;->ۧ()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/۫ܳ֫;->֫:Ll/ۤܳ֫;

    invoke-virtual {v0}, Ll/ۤܳ֫;->onHasView()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
