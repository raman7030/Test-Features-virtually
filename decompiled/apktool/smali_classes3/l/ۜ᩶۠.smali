.class public final Ll/ۜ᩶۠;
.super Ljava/lang/Object;
.source "742G"

# interfaces
.implements Ll/֫᩶۠;


# instance fields
.field public final synthetic ᩸:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 134
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜ᩶۠;->᩸:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 136
    iget-object v0, p0, Ll/ۜ᩶۠;->᩸:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫()Z
    .locals 2

    .line 170
    invoke-virtual {p0}, Ll/ۜ᩶۠;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\bMODULE\\b"

    invoke-virtual {v0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final ۧ()Z
    .locals 2

    .line 138
    iget-object v0, p0, Ll/ۜ᩶۠;->᩸:Ljava/lang/String;

    const-string v1, "_OUTPUT"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
