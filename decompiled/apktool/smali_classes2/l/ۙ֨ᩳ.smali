.class public final synthetic Ll/ۙ֨ᩳ;
.super Ljava/lang/Object;
.source "3B3L"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:Z

.field public final synthetic ᩶:I

.field public final synthetic ᩸:Ll/᩹ܶᩳ;

.field public final synthetic ᩹:Z


# direct methods
.method public synthetic constructor <init>(Ll/᩹ܶᩳ;ZIZ)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙ֨ᩳ;->᩸:Ll/᩹ܶᩳ;

    iput-boolean p2, p0, Ll/ۙ֨ᩳ;->᩹:Z

    iput p3, p0, Ll/ۙ֨ᩳ;->᩶:I

    iput-boolean p4, p0, Ll/ۙ֨ᩳ;->ۙ:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 2
    iget v0, p0, Ll/ۙ֨ᩳ;->᩶:I

    .line 4
    iget-boolean v1, p0, Ll/ۙ֨ᩳ;->ۙ:Z

    .line 419
    iget-object v2, p0, Ll/ۙ֨ᩳ;->᩸:Ll/᩹ܶᩳ;

    iget-boolean v3, p0, Ll/ۙ֨ᩳ;->᩹:Z

    invoke-virtual {v2, v0, v3, v1}, Ll/᩹ܶᩳ;->֫(IZZ)V

    return-void
.end method
