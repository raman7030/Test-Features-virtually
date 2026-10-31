.class public abstract Ll/ۡۜܺ;
.super Ll/ܺۜܺ;
.source "JB95"


# instance fields
.field public final ᩹:Ll/۫ܺܺ;


# direct methods
.method public constructor <init>(Ll/۫ܺܺ;)V
    .locals 1

    .line 37
    invoke-direct {p0}, Ll/ܺۜܺ;-><init>()V

    if-eqz p1, :cond_0

    .line 42
    iput-object p1, p0, Ll/ۡۜܺ;->᩹:Ll/۫ܺܺ;

    return-void

    .line 39
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "type == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public ֫(Ll/֫ۜܺ;)V
    .locals 1

    .line 50
    invoke-virtual {p1}, Ll/֫ۜܺ;->᩵()Ll/ܽ᩷ܺ;

    move-result-object p1

    .line 51
    iget-object v0, p0, Ll/ۡۜܺ;->᩹:Ll/۫ܺܺ;

    invoke-virtual {p1, v0}, Ll/ܽ᩷ܺ;->ۧ(Ll/۫ܺܺ;)Ll/ۧ᩷ܺ;

    return-void
.end method

.method public final ܳ()Ll/۫ܺܺ;
    .locals 1

    .line 61
    iget-object v0, p0, Ll/ۡۜܺ;->᩹:Ll/۫ܺܺ;

    return-object v0
.end method
