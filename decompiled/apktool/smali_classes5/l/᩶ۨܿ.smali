.class public final Ll/᩶ۨܿ;
.super Ljava/lang/Object;
.source "PAKQ"

# interfaces
.implements Ll/ۚۢۡ;


# instance fields
.field public final synthetic ֫:Ll/ۗۨܿ;

.field public final synthetic ۧ:[I


# direct methods
.method public constructor <init>(Ll/ۗۨܿ;[I)V
    .locals 0

    .line 313
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶ۨܿ;->֫:Ll/ۗۨܿ;

    iput-object p2, p0, Ll/᩶ۨܿ;->ۧ:[I

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 316
    iget-object v0, p0, Ll/᩶ۨܿ;->֫:Ll/ۗۨܿ;

    invoke-static {v0}, Ll/ۗۨܿ;->ۜ(Ll/ۗۨܿ;)Ll/۠ۢۡ;

    move-result-object v0

    iget-object v1, p0, Ll/᩶ۨܿ;->ۧ:[I

    invoke-virtual {v0, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    return-void
.end method
