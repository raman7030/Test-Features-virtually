.class public final Ll/۬ۢܿ;
.super Ljava/lang/Object;
.source "K6V4"


# instance fields
.field public final ֫:Ll/ۢۖܿ;

.field public final ۧ:I

.field public final ܽ:I


# direct methods
.method public constructor <init>(ILl/ۢۖܿ;)V
    .locals 1

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput p1, p0, Ll/۬ۢܿ;->ܽ:I

    .line 15
    invoke-virtual {p2}, Ll/ۢۖܿ;->֫()I

    move-result v0

    add-int/2addr v0, p1

    iput v0, p0, Ll/۬ۢܿ;->ۧ:I

    .line 16
    iput-object p2, p0, Ll/۬ۢܿ;->֫:Ll/ۢۖܿ;

    return-void
.end method
