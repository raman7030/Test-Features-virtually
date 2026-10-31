.class public final Ll/᩻۬;
.super Ll/ܳۤ;
.source "857F"


# instance fields
.field public ֫:Ll/ܶۗ;


# direct methods
.method public constructor <init>(Ll/ܶۗ;)V
    .locals 0

    .line 469
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 362
    iput-object p1, p0, Ll/᩻۬;->֫:Ll/ܶۗ;

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 1

    .line 374
    iget-object v0, p0, Ll/᩻۬;->֫:Ll/ܶۗ;

    if-eqz v0, :cond_0

    .line 375
    invoke-virtual {v0, p1}, Ll/ܶۗ;->onFontRetrievalFailed(I)V

    :cond_0
    return-void
.end method

.method public final ֫(Landroid/graphics/Typeface;)V
    .locals 1

    .line 367
    iget-object v0, p0, Ll/᩻۬;->֫:Ll/ܶۗ;

    if-eqz v0, :cond_0

    .line 368
    invoke-virtual {v0, p1}, Ll/ܶۗ;->onFontRetrieved(Landroid/graphics/Typeface;)V

    :cond_0
    return-void
.end method
