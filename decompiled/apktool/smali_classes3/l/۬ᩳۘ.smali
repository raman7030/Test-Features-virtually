.class public final Ll/۬ᩳۘ;
.super Ljava/lang/Object;
.source "T1MK"


# instance fields
.field public final ֫:[I

.field public final ۧ:[I


# direct methods
.method public constructor <init>([I[I)V
    .locals 0

    .line 294
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 295
    iput-object p1, p0, Ll/۬ᩳۘ;->֫:[I

    .line 296
    iput-object p2, p0, Ll/۬ᩳۘ;->ۧ:[I

    return-void
.end method


# virtual methods
.method public final ֫(I)I
    .locals 2

    .line 304
    iget-object v0, p0, Ll/۬ᩳۘ;->ۧ:[I

    aget v0, v0, p1

    iget-object v1, p0, Ll/۬ᩳۘ;->֫:[I

    aget p1, v1, p1

    invoke-static {p1}, Ljava/lang/Character;->charCount(I)I

    move-result p1

    add-int/2addr p1, v0

    return p1
.end method
