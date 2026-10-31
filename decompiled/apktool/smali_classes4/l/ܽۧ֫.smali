.class public final Ll/ܽۧ֫;
.super Ll/᩷۟;
.source "83VO"


# instance fields
.field public final synthetic ۧ:Ll/ᩳۧ֫;


# direct methods
.method public constructor <init>(Ll/ᩳۧ֫;)V
    .locals 0

    .line 1245
    iput-object p1, p0, Ll/ܽۧ֫;->ۧ:Ll/ᩳۧ֫;

    invoke-direct {p0}, Ll/᩷۟;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(I)Ll/ܳ۟;
    .locals 1

    .line 1252
    iget-object v0, p0, Ll/ܽۧ֫;->ۧ:Ll/ᩳۧ֫;

    .line 1253
    invoke-virtual {v0, p1}, Ll/ᩳۧ֫;->obtainAccessibilityNodeInfo(I)Ll/ܳ۟;

    move-result-object p1

    .line 1254
    invoke-static {p1}, Ll/ܳ۟;->֫(Ll/ܳ۟;)Ll/ܳ۟;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(IILandroid/os/Bundle;)Z
    .locals 1

    .line 1259
    iget-object v0, p0, Ll/ܽۧ֫;->ۧ:Ll/ᩳۧ֫;

    invoke-virtual {v0, p1, p2, p3}, Ll/ᩳۧ֫;->performAction(IILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public final ۧ(I)Ll/ܳ۟;
    .locals 2

    const/4 v0, 0x2

    .line 1264
    iget-object v1, p0, Ll/ܽۧ֫;->ۧ:Ll/ᩳۧ֫;

    if-ne p1, v0, :cond_0

    .line 1265
    iget p1, v1, Ll/ᩳۧ֫;->mAccessibilityFocusedVirtualViewId:I

    goto :goto_0

    :cond_0
    iget p1, v1, Ll/ᩳۧ֫;->mKeyboardFocusedVirtualViewId:I

    :goto_0
    const/high16 v0, -0x80000000

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    return-object p1

    .line 1269
    :cond_1
    invoke-virtual {p0, p1}, Ll/ܽۧ֫;->֫(I)Ll/ܳ۟;

    move-result-object p1

    return-object p1
.end method
