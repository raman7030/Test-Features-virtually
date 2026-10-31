.class public final Ll/۟ܰ᩵;
.super Ljava/lang/Object;
.source "N3OT"


# instance fields
.field public final ֫:Ll/ۨܽ֡;

.field public final ۧ:Ljava/util/ArrayList;

.field public ܽ:Ll/ܰܰ᩵;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 289
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    .line 292
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 285
    sget-object v1, Ll/ۧ۟᩵;->᩷:Ll/ܰܰ᩵;

    iput-object v1, p0, Ll/۟ܰ᩵;->ܽ:Ll/ܰܰ᩵;

    .line 286
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Ll/۟ܰ᩵;->ۧ:Ljava/util/ArrayList;

    .line 293
    invoke-static {v0}, Ll/ۨܽ֡;->ܿ(Ljava/lang/String;)Ll/ۨܽ֡;

    move-result-object v0

    iput-object v0, p0, Ll/۟ܰ᩵;->֫:Ll/ۨܽ֡;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۧ۟᩵;
    .locals 4

    .line 340
    iget-object v0, p0, Ll/۟ܰ᩵;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 343
    new-instance v1, Ll/ۧ۟᩵;

    iget-object v2, p0, Ll/۟ܰ᩵;->֫:Ll/ۨܽ֡;

    iget-object v3, p0, Ll/۟ܰ᩵;->ܽ:Ll/ܰܰ᩵;

    invoke-direct {v1, v2, v3, v0}, Ll/ۧ۟᩵;-><init>(Ll/ۨܽ֡;Ll/ܰܰ᩵;Ljava/util/ArrayList;)V

    return-object v1

    .line 341
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Multipart body must have at least one part."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 244
    invoke-static {v0, p2}, Ll/ۖ۟᩵;->֫(Ll/ܰܰ᩵;Ljava/lang/String;)Ll/ۖ۟᩵;

    move-result-object p2

    invoke-static {p1, v0, p2}, Ll/֫۟᩵;->֫(Ljava/lang/String;Ljava/lang/String;Ll/ۖ۟᩵;)Ll/֫۟᩵;

    move-result-object p1

    .line 334
    iget-object p2, p0, Ll/۟ܰ᩵;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;Ll/ۖ۟᩵;)V
    .locals 0

    .line 328
    invoke-static {p1, p2, p3}, Ll/֫۟᩵;->֫(Ljava/lang/String;Ljava/lang/String;Ll/ۖ۟᩵;)Ll/֫۟᩵;

    move-result-object p1

    .line 334
    iget-object p2, p0, Ll/۟ܰ᩵;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/ܰܰ᩵;)V
    .locals 3

    if-eqz p1, :cond_1

    .line 304
    invoke-virtual {p1}, Ll/ܰܰ᩵;->֫()Ljava/lang/String;

    move-result-object v0

    const-string v1, "multipart"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 307
    iput-object p1, p0, Ll/۟ܰ᩵;->ܽ:Ll/ܰܰ᩵;

    return-void

    .line 305
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "multipart != "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 302
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "type == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
