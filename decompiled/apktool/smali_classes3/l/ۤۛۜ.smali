.class public final Ll/ۤۛۜ;
.super Ljava/lang/Object;
.source "B6MB"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ᩶:I

.field public final ᩸:[B

.field public final ᩹:Ll/᩹ۛۜ;


# direct methods
.method public constructor <init>([BILl/᩹ۛۜ;)V
    .locals 0

    .line 583
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 584
    iput-object p1, p0, Ll/ۤۛۜ;->᩸:[B

    iput p2, p0, Ll/ۤۛۜ;->᩶:I

    iput-object p3, p0, Ll/ۤۛۜ;->᩹:Ll/᩹ۛۜ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 586
    iget-object v0, p0, Ll/ۤۛۜ;->᩹:Ll/᩹ۛۜ;

    invoke-virtual {v0}, Ll/᩹ۛۜ;->close()V

    return-void
.end method
