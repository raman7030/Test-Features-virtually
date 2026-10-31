.class public final Ll/֫۟᩵;
.super Ljava/lang/Object;
.source "N3OT"


# instance fields
.field public final ֫:Ll/ۖ۟᩵;

.field public final ۧ:Ll/ۤܰ᩵;


# direct methods
.method public constructor <init>(Ll/ۤܰ᩵;Ll/ۖ۟᩵;)V
    .locals 0

    .line 269
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 270
    iput-object p1, p0, Ll/֫۟᩵;->ۧ:Ll/ۤܰ᩵;

    .line 271
    iput-object p2, p0, Ll/֫۟᩵;->֫:Ll/ۖ۟᩵;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ll/ۖ۟᩵;)Ll/֫۟᩵;
    .locals 2

    if-eqz p0, :cond_3

    .line 251
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "form-data; name="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 252
    invoke-static {v0, p0}, Ll/ۧ۟᩵;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    const-string p0, "; filename="

    .line 255
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    invoke-static {v0, p1}, Ll/ۧ۟᩵;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 259
    :cond_0
    new-instance p0, Ll/۫ܰ᩵;

    invoke-direct {p0}, Ll/۫ܰ᩵;-><init>()V

    .line 260
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Content-Disposition"

    .line 321
    invoke-static {v0}, Ll/ۤܰ᩵;->ܽ(Ljava/lang/String;)V

    .line 322
    invoke-virtual {p0, v0, p1}, Ll/۫ܰ᩵;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 401
    new-instance p1, Ll/ۤܰ᩵;

    invoke-direct {p1, p0}, Ll/ۤܰ᩵;-><init>(Ll/۫ܰ᩵;)V

    const-string p0, "Content-Type"

    .line 234
    invoke-virtual {p1, p0}, Ll/ۤܰ᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_2

    const-string p0, "Content-Length"

    .line 237
    invoke-virtual {p1, p0}, Ll/ۤܰ᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1

    .line 240
    new-instance p0, Ll/֫۟᩵;

    invoke-direct {p0, p1, p2}, Ll/֫۟᩵;-><init>(Ll/ۤܰ᩵;Ll/ۖ۟᩵;)V

    return-object p0

    .line 238
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Unexpected header: Content-Length"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 235
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Unexpected header: Content-Type"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 249
    :cond_3
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "name == null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
