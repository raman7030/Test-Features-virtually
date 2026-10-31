.class public final Ll/᩺ۛۢ;
.super Ljava/lang/Object;
.source "E6PC"


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܽ:Ll/ܰۛۢ;


# direct methods
.method public constructor <init>(Ll/ܰۛۢ;I)V
    .locals 0

    .line 260
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 261
    iput-object p1, p0, Ll/᩺ۛۢ;->ܽ:Ll/ܰۛۢ;

    .line 262
    iput p2, p0, Ll/᩺ۛۢ;->֫:I

    .line 263
    iget-object p1, p1, Ll/ܰۛۢ;->ܿ:Ll/᩺ۛۢ;

    const/4 p2, 0x1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget p1, p1, Ll/᩺ۛۢ;->ۧ:I

    add-int/2addr p2, p1

    :goto_0
    iput p2, p0, Ll/᩺ۛۢ;->ۧ:I

    return-void
.end method
