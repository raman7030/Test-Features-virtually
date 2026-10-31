.class public final Ll/᩺ۛᩳ;
.super Ljava/lang/Object;
.source "X68P"


# instance fields
.field public ֫:[Ll/ۡ֫ܿ;

.field public final synthetic ۧ:Ll/۫ۨᩳ;


# direct methods
.method public constructor <init>(Ll/۫ۨᩳ;)V
    .locals 7

    .line 9244
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺ۛᩳ;->ۧ:Ll/۫ۨᩳ;

    .line 9245
    new-instance v0, Ll/ۡ֫ܿ;

    .line 9246
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2}, Ll/ۡ֫ܿ;-><init>(Landroid/content/Context;Ll/۫ۨᩳ;I)V

    new-instance v1, Ll/ۡ֫ܿ;

    .line 9247
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const/4 v4, 0x1

    invoke-direct {v1, v3, p1, v4}, Ll/ۡ֫ܿ;-><init>(Landroid/content/Context;Ll/۫ۨᩳ;I)V

    new-instance v3, Ll/ۡ֫ܿ;

    .line 9248
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    const/4 v6, 0x2

    invoke-direct {v3, v5, p1, v6}, Ll/ۡ֫ܿ;-><init>(Landroid/content/Context;Ll/۫ۨᩳ;I)V

    const/4 p1, 0x3

    new-array p1, p1, [Ll/ۡ֫ܿ;

    aput-object v0, p1, v2

    aput-object v1, p1, v4

    aput-object v3, p1, v6

    iput-object p1, p0, Ll/᩺ۛᩳ;->֫:[Ll/ۡ֫ܿ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    const/4 v0, 0x0

    .line 17
    invoke-virtual {p0, v0, v0, v0, v0}, Ll/᩺ۛᩳ;->֫(IIIZ)V

    const/4 v1, 0x1

    .line 18
    invoke-virtual {p0, v1, v0, v0, v0}, Ll/᩺ۛᩳ;->֫(IIIZ)V

    const/4 v1, 0x2

    .line 19
    invoke-virtual {p0, v1, v0, v0, v0}, Ll/᩺ۛᩳ;->֫(IIIZ)V

    return-void
.end method

.method public final ֫(IIIZ)V
    .locals 1

    .line 9260
    iget-object v0, p0, Ll/᩺ۛᩳ;->֫:[Ll/ۡ֫ܿ;

    aget-object p1, v0, p1

    invoke-virtual {p1, p2, p3, p4}, Ll/ۡ֫ܿ;->֫(IIZ)V

    return-void
.end method
