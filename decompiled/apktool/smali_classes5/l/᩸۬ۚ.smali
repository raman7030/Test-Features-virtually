.class public final Ll/᩸۬ۚ;
.super Ll/ܶ۬ۚ;
.source "E7DP"


# instance fields
.field public final ֫:Ljava/lang/StringBuilder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Ll/᩸۬ۚ;->֫:Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public final flush()V
    .locals 0

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Ll/᩸۬ۚ;->֫:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 43
    iget-object v0, p0, Ll/᩸۬ۚ;->֫:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ֫(Ljava/lang/Throwable;)V
    .locals 1

    .line 73
    iget-object v0, p0, Ll/᩸۬ۚ;->֫:Ljava/lang/StringBuilder;

    invoke-static {p1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ۧ()Ll/֨۬ۚ;
    .locals 0

    return-object p0
.end method

.method public final ܽ()Ll/֨۬ۚ;
    .locals 0

    return-object p0
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 1

    .line 38
    iget-object v0, p0, Ll/᩸۬ۚ;->֫:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ܿ(Ljava/lang/String;)V
    .locals 1

    .line 58
    iget-object v0, p0, Ll/᩸۬ۚ;->֫:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ᩳ(Ljava/lang/String;)V
    .locals 1

    .line 63
    iget-object v0, p0, Ll/᩸۬ۚ;->֫:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method
