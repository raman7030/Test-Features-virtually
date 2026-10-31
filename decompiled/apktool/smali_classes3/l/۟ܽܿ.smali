.class public final synthetic Ll/۟ܽܿ;
.super Ljava/lang/Object;
.source "R16R"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۗ:I

.field public final synthetic ۙ:I

.field public final synthetic ۫:Landroid/view/View;

.field public final synthetic ۬:I

.field public final synthetic ᩶:Ll/۫ۨᩳ;

.field public final synthetic ᩸:Ll/ᩳᩳܿ;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(Ll/ᩳᩳܿ;ILl/۫ۨᩳ;IIILandroid/view/View;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟ܽܿ;->᩸:Ll/ᩳᩳܿ;

    iput p2, p0, Ll/۟ܽܿ;->᩹:I

    iput-object p3, p0, Ll/۟ܽܿ;->᩶:Ll/۫ۨᩳ;

    iput p4, p0, Ll/۟ܽܿ;->ۙ:I

    iput p5, p0, Ll/۟ܽܿ;->ۗ:I

    iput p6, p0, Ll/۟ܽܿ;->۬:I

    iput-object p7, p0, Ll/۟ܽܿ;->۫:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 0
    iget v5, p0, Ll/۟ܽܿ;->۬:I

    iget-object v6, p0, Ll/۟ܽܿ;->۫:Landroid/view/View;

    iget-object v0, p0, Ll/۟ܽܿ;->᩸:Ll/ᩳᩳܿ;

    iget v1, p0, Ll/۟ܽܿ;->᩹:I

    iget-object v2, p0, Ll/۟ܽܿ;->᩶:Ll/۫ۨᩳ;

    iget v3, p0, Ll/۟ܽܿ;->ۙ:I

    iget v4, p0, Ll/۟ܽܿ;->ۗ:I

    invoke-static/range {v0 .. v6}, Ll/ᩳᩳܿ;->֫(Ll/ᩳᩳܿ;ILl/۫ۨᩳ;IIILandroid/view/View;)V

    return-void
.end method
