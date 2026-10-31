.class public final Ll/᩵ۨ᩻;
.super Ljava/lang/Object;
.source "L79Z"


# instance fields
.field public final ֫:I

.field public final ۧ:Ljava/lang/CharSequence;

.field public final ܽ:Z

.field public final ܿ:I

.field public final ᩳ:I


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;IIZ)V
    .locals 0

    .line 374
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 375
    iput-object p1, p0, Ll/᩵ۨ᩻;->ۧ:Ljava/lang/CharSequence;

    .line 376
    iput p2, p0, Ll/᩵ۨ᩻;->ܿ:I

    .line 377
    iput p3, p0, Ll/᩵ۨ᩻;->ᩳ:I

    .line 378
    iput-boolean p4, p0, Ll/᩵ۨ᩻;->ܽ:Z

    .line 379
    invoke-static {p1, p2, p3}, Ljava/lang/Character;->codePointCount(Ljava/lang/CharSequence;II)I

    move-result p1

    iput p1, p0, Ll/᩵ۨ᩻;->֫:I

    return-void
.end method
