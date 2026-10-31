.class public final Ll/ᩴ۬ۚ;
.super Ll/ۘ۬ۚ;
.source "47C4"


# instance fields
.field public ܽ:Ljava/io/PrintWriter;


# direct methods
.method public constructor <init>(Ljava/io/PrintWriter;)V
    .locals 2

    .line 43
    invoke-direct {p0}, Ll/ۘ۬ۚ;-><init>()V

    .line 45
    new-instance v0, Ljava/io/PrintWriter;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;Z)V

    iput-object v0, p0, Ll/ᩴ۬ۚ;->ܽ:Ljava/io/PrintWriter;

    return-void
.end method


# virtual methods
.method public final flush()V
    .locals 1

    .line 71
    iget-object v0, p0, Ll/ᩴ۬ۚ;->ܽ:Ljava/io/PrintWriter;

    invoke-virtual {v0}, Ljava/io/PrintWriter;->flush()V

    return-void
.end method

.method public final ֫()Ljava/io/DataOutputStream;
    .locals 2

    .line 76
    new-instance v0, Ll/۬ۗۚ;

    const-string v1, "Use EscapedPrintStreamOutput"

    .line 9
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 76
    throw v0
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 55
    iget-object v0, p0, Ll/ᩴ۬ۚ;->ܽ:Ljava/io/PrintWriter;

    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    return-void
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "text-output stream"

    return-object v0
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 0

    .line 65
    invoke-super {p0, p1}, Ll/ۘ۬ۚ;->ۧ(Ljava/lang/String;)V

    .line 66
    iget-object p1, p0, Ll/ᩴ۬ۚ;->ܽ:Ljava/io/PrintWriter;

    invoke-virtual {p1}, Ljava/io/PrintWriter;->flush()V

    return-void
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 1

    .line 50
    iget-object v0, p0, Ll/ᩴ۬ۚ;->ܽ:Ljava/io/PrintWriter;

    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    return-void
.end method
