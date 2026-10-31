.class public final Ll/ۡܳۡ;
.super Ljava/lang/Object;
.source "YBJ2"


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:C

.field public ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;C)V
    .locals 0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Ll/ۡܳۡ;->֫:Ljava/lang/String;

    .line 51
    iput-object p2, p0, Ll/ۡܳۡ;->ܽ:Ljava/lang/String;

    .line 52
    iput-char p3, p0, Ll/ۡܳۡ;->ۧ:C

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 56
    iget-object v0, p0, Ll/ۡܳۡ;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ()C
    .locals 1

    .line 64
    iget-char v0, p0, Ll/ۡܳۡ;->ۧ:C

    return v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Ll/ۡܳۡ;->ܽ:Ljava/lang/String;

    return-object v0
.end method
