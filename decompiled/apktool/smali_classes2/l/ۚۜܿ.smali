.class public final Ll/ۚۜܿ;
.super Ljava/lang/Object;
.source "5ATX"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final ᩸:Ll/֨ۜܿ;

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 120
    iput-object p1, p0, Ll/ۚۜܿ;->᩹:Ljava/lang/String;

    .line 121
    new-instance p1, Ll/֨ۜܿ;

    .line 146
    invoke-direct {p1}, Ll/᩸᩵ᩴ;-><init>()V

    .line 121
    iput-object p1, p0, Ll/ۚۜܿ;->᩸:Ll/֨ۜܿ;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ۚۜܿ;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۚۜܿ;)Ll/֨ۜܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚۜܿ;->᩸:Ll/֨ۜܿ;

    return-object p0
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 115
    check-cast p1, Ll/ۚۜܿ;

    .line 142
    iget-object v0, p0, Ll/ۚۜܿ;->᩹:Ljava/lang/String;

    iget-object p1, p1, Ll/ۚۜܿ;->᩹:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final ֫()Ljava/lang/String;
    .locals 2

    .line 137
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ۚۜܿ;->᩹:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۚۜܿ;->᩸:Ll/֨ۜܿ;

    invoke-virtual {v1}, Ll/֨ۜܿ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/util/ArrayList;I)V
    .locals 3

    add-int/lit8 v0, p2, 0x1

    .line 125
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 126
    iget-object v1, p0, Ll/ۚۜܿ;->᩸:Ll/֨ۜܿ;

    invoke-virtual {v1, p2}, Ll/᩸᩵ᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۚۜܿ;

    if-nez v2, :cond_0

    .line 128
    new-instance v2, Ll/ۚۜܿ;

    invoke-direct {v2, p2}, Ll/ۚۜܿ;-><init>(Ljava/lang/String;)V

    .line 129
    invoke-virtual {v1, p2, v2}, Ll/᩸᩵ᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-eq v0, p2, :cond_1

    .line 132
    invoke-virtual {v2, p1, v0}, Ll/ۚۜܿ;->֫(Ljava/util/ArrayList;I)V

    :cond_1
    return-void
.end method
