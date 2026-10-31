.class public final Ll/ܽܽܺ;
.super Ll/᩻ܽܺ;
.source "3BBD"


# instance fields
.field public final ۧ:Ll/۬ܺܺ;


# direct methods
.method public constructor <init>(Ll/۬ܺܺ;)V
    .locals 1

    const-string v0, "SourceDebugExtension"

    .line 41
    invoke-direct {p0, v0}, Ll/᩻ܽܺ;-><init>(Ljava/lang/String;)V

    .line 47
    iput-object p1, p0, Ll/ܽܽܺ;->ۧ:Ll/۬ܺܺ;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 57
    iget-object v0, p0, Ll/ܽܽܺ;->ۧ:Ll/۬ܺܺ;

    invoke-virtual {v0}, Ll/۬ܺܺ;->֡()I

    move-result v0

    add-int/lit8 v0, v0, 0x6

    return v0
.end method

.method public final ۧ()Ll/۬ܺܺ;
    .locals 1

    .line 66
    iget-object v0, p0, Ll/ܽܽܺ;->ۧ:Ll/۬ܺܺ;

    return-object v0
.end method
