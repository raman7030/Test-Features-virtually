.class public final Ll/ܶۢ᩵;
.super Ll/۬ۜ᩵;
.source "E9UJ"


# static fields
.field public static final serialVersionUID:J = 0x62a498597d29f1d0L


# instance fields
.field public final ᩶:Ljava/lang/String;

.field public final ᩸:Ll/ۤۜ᩵;

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ۡۢ᩵;Ljava/lang/String;Ljava/lang/String;Ll/ۤۜ᩵;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1}, Ljava/util/EventObject;-><init>(Ljava/lang/Object;)V

    .line 53
    iput-object p2, p0, Ll/ܶۢ᩵;->᩶:Ljava/lang/String;

    .line 54
    iput-object p3, p0, Ll/ܶۢ᩵;->᩹:Ljava/lang/String;

    .line 55
    iput-object p4, p0, Ll/ܶۢ᩵;->᩸:Ll/ۤۜ᩵;

    return-void
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 5

    .line 119
    new-instance v0, Ll/᩶ۢ᩵;

    .line 110
    iget-object v1, p0, Ll/ܶۢ᩵;->᩸:Ll/ۤۜ᩵;

    .line 119
    invoke-direct {v0, v1}, Ll/᩶ۢ᩵;-><init>(Ll/ۤۜ᩵;)V

    .line 120
    new-instance v1, Ll/ܶۢ᩵;

    .line 64
    invoke-virtual {p0}, Ljava/util/EventObject;->getSource()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹ۜ᩵;

    .line 120
    check-cast v2, Ll/ۡۢ᩵;

    .line 73
    iget-object v3, p0, Ll/ܶۢ᩵;->᩶:Ljava/lang/String;

    .line 82
    iget-object v4, p0, Ll/ܶۢ᩵;->᩹:Ljava/lang/String;

    .line 120
    invoke-direct {v1, v2, v3, v4, v0}, Ll/ܶۢ᩵;-><init>(Ll/ۡۢ᩵;Ljava/lang/String;Ljava/lang/String;Ll/ۤۜ᩵;)V

    return-object v1
.end method

.method public final clone()Ll/۬ۜ᩵;
    .locals 5

    .line 119
    new-instance v0, Ll/᩶ۢ᩵;

    .line 110
    iget-object v1, p0, Ll/ܶۢ᩵;->᩸:Ll/ۤۜ᩵;

    .line 119
    invoke-direct {v0, v1}, Ll/᩶ۢ᩵;-><init>(Ll/ۤۜ᩵;)V

    .line 120
    new-instance v1, Ll/ܶۢ᩵;

    .line 64
    invoke-virtual {p0}, Ljava/util/EventObject;->getSource()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹ۜ᩵;

    .line 120
    check-cast v2, Ll/ۡۢ᩵;

    .line 73
    iget-object v3, p0, Ll/ܶۢ᩵;->᩶:Ljava/lang/String;

    .line 82
    iget-object v4, p0, Ll/ܶۢ᩵;->᩹:Ljava/lang/String;

    .line 120
    invoke-direct {v1, v2, v3, v4, v0}, Ll/ܶۢ᩵;-><init>(Ll/ۡۢ᩵;Ljava/lang/String;Ljava/lang/String;Ll/ۤۜ᩵;)V

    return-object v1
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 82
    iget-object v0, p0, Ll/ܶۢ᩵;->᩹:Ljava/lang/String;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 91
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[ServiceEventImpl@"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 93
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\n\tname: \'"

    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    iget-object v1, p0, Ll/ܶۢ᩵;->᩹:Ljava/lang/String;

    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\' type: \'"

    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    iget-object v1, p0, Ll/ܶۢ᩵;->᩶:Ljava/lang/String;

    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\' info: \'"

    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    iget-object v1, p0, Ll/ܶۢ᩵;->᩸:Ll/ۤۜ᩵;

    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\']"

    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/᩹ۜ᩵;
    .locals 1

    .line 64
    invoke-virtual {p0}, Ljava/util/EventObject;->getSource()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩹ۜ᩵;

    return-object v0
.end method

.method public final ܽ()Ll/ۤۜ᩵;
    .locals 1

    .line 110
    iget-object v0, p0, Ll/ܶۢ᩵;->᩸:Ll/ۤۜ᩵;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 73
    iget-object v0, p0, Ll/ܶۢ᩵;->᩶:Ljava/lang/String;

    return-object v0
.end method
