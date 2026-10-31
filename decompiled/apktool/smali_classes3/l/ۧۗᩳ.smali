.class public final Ll/ۧۗᩳ;
.super Ljava/lang/Object;
.source "N6TT"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ᩶:I

.field public final ᩸:Ll/۬ۜܽ;

.field public final ᩹:Ll/ۚ۬ᩳ;


# direct methods
.method public constructor <init>(Ll/۬ۜܽ;ILl/ۚ۬ᩳ;)V
    .locals 0

    .line 364
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 365
    iput-object p1, p0, Ll/ۧۗᩳ;->᩸:Ll/۬ۜܽ;

    .line 366
    iput p2, p0, Ll/ۧۗᩳ;->᩶:I

    .line 367
    iput-object p3, p0, Ll/ۧۗᩳ;->᩹:Ll/ۚ۬ᩳ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 371
    iget-object v0, p0, Ll/ۧۗᩳ;->᩹:Ll/ۚ۬ᩳ;

    invoke-virtual {v0}, Ll/ۚ۬ᩳ;->close()V

    return-void
.end method
