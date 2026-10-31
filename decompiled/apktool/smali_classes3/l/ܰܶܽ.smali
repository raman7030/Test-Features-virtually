.class public final Ll/ܰܶܽ;
.super Ljava/lang/Object;
.source "D77D"


# instance fields
.field public final ֫:J

.field public final ۧ:I

.field public final ܽ:I

.field public final ܿ:I

.field public final ᩳ:Ll/ᩳ᩸ܽ;


# direct methods
.method public constructor <init>(IIJILl/ᩳ᩸ܽ;)V
    .locals 0

    .line 270
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 271
    iput p1, p0, Ll/ܰܶܽ;->ܿ:I

    .line 272
    iput p2, p0, Ll/ܰܶܽ;->ۧ:I

    .line 273
    iput-wide p3, p0, Ll/ܰܶܽ;->֫:J

    .line 274
    iput p5, p0, Ll/ܰܶܽ;->ܽ:I

    .line 275
    iput-object p6, p0, Ll/ܰܶܽ;->ᩳ:Ll/ᩳ᩸ܽ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 282
    iget-object v0, p0, Ll/ܰܶܽ;->ᩳ:Ll/ᩳ᩸ܽ;

    .line 730
    iget-object v0, v0, Ll/ᩳ᩸ܽ;->֫:Ll/ܿ᩸ܽ;

    invoke-virtual {v0}, Ll/ܿ᩸ܽ;->֫()V

    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 289
    iget-object v0, p0, Ll/ܰܶܽ;->ᩳ:Ll/ᩳ᩸ܽ;

    .line 735
    iget-object v0, v0, Ll/ᩳ᩸ܽ;->֫:Ll/ܿ᩸ܽ;

    invoke-virtual {v0}, Ll/ܿ᩸ܽ;->ۧ()V

    return-void
.end method
