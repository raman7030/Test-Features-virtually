.class public final Ll/ۢ᩹֫;
.super Ljava/lang/Object;
.source "P8DS"


# instance fields
.field public final ֫:S

.field public final ۧ:S

.field public final ܽ:S

.field public final ᩳ:S


# direct methods
.method public constructor <init>(SSSS)V
    .locals 1

    .line 295
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 296
    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    .line 297
    iput-short p1, p0, Ll/ۢ᩹֫;->֫:S

    .line 298
    iput-short p2, p0, Ll/ۢ᩹֫;->ۧ:S

    .line 299
    iput-short p3, p0, Ll/ۢ᩹֫;->ᩳ:S

    .line 300
    iput-short p4, p0, Ll/ۢ᩹֫;->ܽ:S

    return-void
.end method
