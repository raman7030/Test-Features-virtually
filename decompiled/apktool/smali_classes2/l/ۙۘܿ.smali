.class public final Ll/ۙۘܿ;
.super Ljava/lang/Object;
.source "76ZW"


# static fields
.field public static final ᩳ:Ll/ۙۘܿ;


# instance fields
.field public final ֫:[I

.field public final ۧ:I

.field public final ܽ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 255
    new-instance v0, Ll/ۙۘܿ;

    const/4 v1, 0x0

    new-array v2, v1, [I

    const/4 v3, -0x1

    invoke-direct {v0, v3, v1, v2}, Ll/ۙۘܿ;-><init>(IZ[I)V

    sput-object v0, Ll/ۙۘܿ;->ᩳ:Ll/ۙۘܿ;

    return-void
.end method

.method public constructor <init>(IZ[I)V
    .locals 0

    .line 263
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 264
    iput-object p3, p0, Ll/ۙۘܿ;->֫:[I

    .line 265
    iput-boolean p2, p0, Ll/ۙۘܿ;->ܽ:Z

    .line 267
    iput p1, p0, Ll/ۙۘܿ;->ۧ:I

    return-void
.end method

.method public synthetic constructor <init>([IZII)V
    .locals 0

    .line 0
    invoke-direct {p0, p3, p2, p1}, Ll/ۙۘܿ;-><init>(IZ[I)V

    return-void
.end method

.method public static bridge synthetic ᩳ()Ll/ۙۘܿ;
    .locals 1

    .line 0
    sget-object v0, Ll/ۙۘܿ;->ᩳ:Ll/ۙۘܿ;

    return-object v0
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 294
    iget v0, p0, Ll/ۙۘܿ;->ۧ:I

    return v0
.end method

.method public final ֫(I)I
    .locals 1

    .line 275
    iget-object v0, p0, Ll/ۙۘܿ;->֫:[I

    aget p1, v0, p1

    return p1
.end method

.method public final ۧ()Z
    .locals 1

    .line 284
    iget-boolean v0, p0, Ll/ۙۘܿ;->ܽ:Z

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 271
    iget-object v0, p0, Ll/ۙۘܿ;->֫:[I

    array-length v0, v0

    return v0
.end method
