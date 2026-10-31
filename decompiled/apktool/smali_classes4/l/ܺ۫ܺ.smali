.class public final Ll/ܺ۫ܺ;
.super Ll/᩶ۨܺ;
.source "I5ZF"


# instance fields
.field public final synthetic ᩸:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(Ljava/util/Iterator;)V
    .locals 0

    .line 137
    iput-object p1, p0, Ll/ܺ۫ܺ;->᩸:Ljava/util/Iterator;

    invoke-direct {p0}, Ll/᩶ۨܺ;-><init>()V

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 140
    iget-object v0, p0, Ll/ܺ۫ܺ;->᩸:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .line 146
    iget-object v0, p0, Ll/ܺ۫ܺ;->᩸:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
