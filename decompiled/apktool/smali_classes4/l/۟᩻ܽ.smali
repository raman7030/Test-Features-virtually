.class public final Ll/۟᩻ܽ;
.super Ll/ۘᩳܽ;
.source "Z9R4"


# instance fields
.field public final ᩶:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/ۛۜܽ;)V
    .locals 2

    const/16 v0, 0x100

    .line 12
    invoke-virtual {p1, v0}, Ll/ۛۜܽ;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0}, Ll/ۛۜܽ;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v1, p1}, Ll/ۘᩳܽ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/۟᩻ܽ;->᩶:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ۘ(I)Ll/ۖ᩻ܽ;
    .locals 1

    .line 22
    iget-object v0, p0, Ll/۟᩻ܽ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֫ۜܽ;

    return-object p1
.end method

.method public final ۠()I
    .locals 1

    .line 17
    iget-object v0, p0, Ll/۟᩻ܽ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method
