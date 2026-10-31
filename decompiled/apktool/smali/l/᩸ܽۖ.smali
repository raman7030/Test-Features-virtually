.class public final Ll/᩸ܽۖ;
.super Ljava/lang/Object;
.source "1968"


# static fields
.field public static final ܿ:Ll/᩸ܽۖ;

.field public static final ᩳ:Ll/᩸ܽۖ;


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 53
    new-instance v0, Ll/᩸ܽۖ;

    const-string v1, ""

    const/4 v2, 0x0

    invoke-direct {v0, v1, v1, v2}, Ll/᩸ܽۖ;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    sput-object v0, Ll/᩸ܽۖ;->ᩳ:Ll/᩸ܽۖ;

    .line 64
    new-instance v0, Ll/᩸ܽۖ;

    const-string v1, "  "

    const/4 v2, 0x1

    const-string v3, "\n"

    invoke-direct {v0, v3, v1, v2}, Ll/᩸ܽۖ;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    sput-object v0, Ll/᩸ܽۖ;->ܿ:Ll/᩸ܽۖ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "newline == null"

    .line 67
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "[\r\n]*"

    .line 69
    invoke-virtual {p1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "[ \t]*"

    .line 73
    invoke-virtual {p2, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 77
    iput-object p1, p0, Ll/᩸ܽۖ;->ۧ:Ljava/lang/String;

    .line 78
    iput-object p2, p0, Ll/᩸ܽۖ;->֫:Ljava/lang/String;

    .line 79
    iput-boolean p3, p0, Ll/᩸ܽۖ;->ܽ:Z

    return-void

    .line 74
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Only combinations of spaces and tabs are allowed in indent."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 70
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Only combinations of \\n and \\r are allowed in newline."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 145
    iget-object v0, p0, Ll/᩸ܽۖ;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)Ll/᩸ܽۖ;
    .locals 3

    .line 109
    new-instance v0, Ll/᩸ܽۖ;

    iget-object v1, p0, Ll/᩸ܽۖ;->ۧ:Ljava/lang/String;

    iget-boolean v2, p0, Ll/᩸ܽۖ;->ܽ:Z

    invoke-direct {v0, v1, p1, v2}, Ll/᩸ܽۖ;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 135
    iget-object v0, p0, Ll/᩸ܽۖ;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 154
    iget-boolean v0, p0, Ll/᩸ܽۖ;->ܽ:Z

    return v0
.end method
