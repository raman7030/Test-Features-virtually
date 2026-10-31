.class public final Ll/᩶۫ܺ;
.super Ll/᩶ۨܺ;
.source "I5ZF"


# instance fields
.field public ᩸:Z

.field public final ᩹:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1109
    invoke-direct {p0}, Ll/᩶ۨܺ;-><init>()V

    .line 1110
    iput-object p1, p0, Ll/᩶۫ܺ;->᩹:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 1115
    iget-boolean v0, p0, Ll/᩶۫ܺ;->᩸:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .line 1121
    iget-boolean v0, p0, Ll/᩶۫ܺ;->᩸:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 1124
    iput-boolean v0, p0, Ll/᩶۫ܺ;->᩸:Z

    .line 1125
    iget-object v0, p0, Ll/᩶۫ܺ;->᩹:Ljava/lang/Object;

    return-object v0

    .line 1122
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
