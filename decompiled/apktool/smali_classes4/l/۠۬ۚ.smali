.class public final Ll/۠۬ۚ;
.super Ll/ܶ۬ۚ;
.source "F7DQ"


# instance fields
.field public ֫:Ljava/io/PrintWriter;

.field public ۧ:Ljava/io/PrintWriter;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 39
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    new-instance v2, Ljava/io/PrintWriter;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v3}, Ljava/io/PrintWriter;-><init>(Ljava/io/OutputStream;Z)V

    iput-object v2, p0, Ll/۠۬ۚ;->ۧ:Ljava/io/PrintWriter;

    .line 52
    new-instance v0, Ljava/io/PrintWriter;

    invoke-direct {v0, v1, v3}, Ljava/io/PrintWriter;-><init>(Ljava/io/OutputStream;Z)V

    iput-object v0, p0, Ll/۠۬ۚ;->֫:Ljava/io/PrintWriter;

    return-void
.end method


# virtual methods
.method public final flush()V
    .locals 1

    .line 112
    iget-object v0, p0, Ll/۠۬ۚ;->ۧ:Ljava/io/PrintWriter;

    invoke-virtual {v0}, Ljava/io/PrintWriter;->flush()V

    .line 113
    iget-object v0, p0, Ll/۠۬ۚ;->֫:Ljava/io/PrintWriter;

    invoke-virtual {v0}, Ljava/io/PrintWriter;->flush()V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 62
    iget-object v0, p0, Ll/۠۬ۚ;->ۧ:Ljava/io/PrintWriter;

    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Throwable;)V
    .locals 1

    .line 97
    iget-object v0, p0, Ll/۠۬ۚ;->֫:Ljava/io/PrintWriter;

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    return-void
.end method

.method public final ۧ()Ll/֨۬ۚ;
    .locals 2

    .line 107
    new-instance v0, Ll/ᩴ۬ۚ;

    iget-object v1, p0, Ll/۠۬ۚ;->֫:Ljava/io/PrintWriter;

    invoke-direct {v0, v1}, Ll/ᩴ۬ۚ;-><init>(Ljava/io/PrintWriter;)V

    return-object v0
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 1

    .line 87
    iget-object p1, p0, Ll/۠۬ۚ;->֫:Ljava/io/PrintWriter;

    .line 89
    :try_start_0
    iget-object v0, p0, Ll/۠۬ۚ;->ۧ:Ljava/io/PrintWriter;

    invoke-virtual {v0}, Ljava/io/PrintWriter;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    invoke-virtual {p1}, Ljava/io/PrintWriter;->flush()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Ljava/io/PrintWriter;->flush()V

    .line 92
    throw v0
.end method

.method public final ܽ()Ll/֨۬ۚ;
    .locals 2

    .line 102
    new-instance v0, Ll/ᩴ۬ۚ;

    iget-object v1, p0, Ll/۠۬ۚ;->ۧ:Ljava/io/PrintWriter;

    invoke-direct {v0, v1}, Ll/ᩴ۬ۚ;-><init>(Ljava/io/PrintWriter;)V

    return-object v0
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 1

    .line 57
    iget-object v0, p0, Ll/۠۬ۚ;->ۧ:Ljava/io/PrintWriter;

    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    return-void
.end method

.method public final ܿ(Ljava/lang/String;)V
    .locals 1

    .line 72
    iget-object v0, p0, Ll/۠۬ۚ;->֫:Ljava/io/PrintWriter;

    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    return-void
.end method

.method public final ᩳ(Ljava/lang/String;)V
    .locals 1

    .line 77
    iget-object v0, p0, Ll/۠۬ۚ;->֫:Ljava/io/PrintWriter;

    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    return-void
.end method
