.class public final Ll/ۨܿ֨;
.super Ljava/lang/Object;
.source "S7EN"


# instance fields
.field public final ֫:Ll/᩷۠ᩴ;

.field public ۧ:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/᩷۠ᩴ;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p2, :cond_0

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/String;

    .line 41
    invoke-static {p1, p2}, Ll/ۡ۠ᩴ;->get(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-interface {p2, p1}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Ll/ۨܿ֨;->֫:Ll/᩷۠ᩴ;

    .line 43
    :try_start_0
    sget-object p2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {p1, p2}, Ll/ܿ۠ᩴ;->readAllLines(Ll/᩷۠ᩴ;Ljava/nio/charset/Charset;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ۨܿ֨;->ۧ:Ljava/util/List;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
