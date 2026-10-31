.class public final Ll/ܿ۟ۧ;
.super Ljava/lang/Object;
.source "F1OQ"

# interfaces
.implements Ll/ۚ۟;


# instance fields
.field public final synthetic ᩸:Ll/᩻۟ۧ;


# direct methods
.method public constructor <init>(Ll/᩻۟ۧ;)V
    .locals 0

    .line 1360
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿ۟ۧ;->᩸:Ll/᩻۟ۧ;

    return-void
.end method


# virtual methods
.method public final perform(Landroid/view/View;Ll/ۢ۟;)Z
    .locals 2

    .line 1364
    check-cast p1, Ll/ۖ۟ۧ;

    .line 682
    iget p1, p1, Ll/ۖ۟ۧ;->᩹:I

    const/4 p2, 0x1

    sub-int/2addr p1, p2

    .line 1494
    iget-object v0, p0, Ll/ܿ۟ۧ;->᩸:Ll/᩻۟ۧ;

    iget-object v0, v0, Ll/᩻۟ۧ;->ܽ:Ll/ۖ۟ۧ;

    invoke-virtual {v0}, Ll/ۖ۟ۧ;->ܳ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1495
    invoke-virtual {v0, p1, p2}, Ll/ۖ۟ۧ;->ۧ(IZ)V

    :cond_0
    return p2
.end method
