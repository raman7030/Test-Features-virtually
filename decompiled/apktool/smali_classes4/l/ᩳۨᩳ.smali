.class public final synthetic Ll/ᩳۨᩳ;
.super Ljava/lang/Object;
.source "X68P"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ܿۨᩳ;

.field public final synthetic ᩹:Ll/֨۟ᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/ܿۨᩳ;Ll/֨۟ᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳۨᩳ;->᩸:Ll/ܿۨᩳ;

    iput-object p2, p0, Ll/ᩳۨᩳ;->᩹:Ll/֨۟ᩳ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 8691
    iget-object v0, p0, Ll/ᩳۨᩳ;->᩸:Ll/ܿۨᩳ;

    iget-object v0, v0, Ll/ܿۨᩳ;->ᩴ֫:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    move-result v1

    .line 8692
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result v0

    add-int/lit8 v2, v0, -0x1

    .line 8694
    iget-object v3, p0, Ll/ᩳۨᩳ;->᩹:Ll/֨۟ᩳ;

    invoke-interface {v3, v1, v2, v1, v0}, Ll/֨۟ᩳ;->֫(IIII)V

    return-void
.end method
