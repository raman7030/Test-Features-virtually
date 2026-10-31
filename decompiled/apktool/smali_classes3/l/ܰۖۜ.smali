.class public final Ll/ܰۖۜ;
.super Ljava/lang/Exception;
.source "T6XI"


# instance fields
.field public final ᩶:Ll/֫ۘۜ;

.field public final ᩸:I

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ll/֫ۘۜ;II)V
    .locals 1

    .line 142
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 143
    iput-object p1, p0, Ll/ܰۖۜ;->᩶:Ll/֫ۘۜ;

    .line 144
    iput p2, p0, Ll/ܰۖۜ;->᩹:I

    .line 145
    iput p3, p0, Ll/ܰۖۜ;->᩸:I

    return-void
.end method
