.class public final Ll/ۗ᩶᩻;
.super Ljava/lang/Object;
.source "Y20N"

# interfaces
.implements Ll/ܰۡۡ;


# instance fields
.field public final synthetic ֫:Ll/۫ܽܽ;

.field public final synthetic ۧ:Ll/۟ۡۡ;


# direct methods
.method public constructor <init>(Ll/۫ܽܽ;Ll/۟ۡۡ;)V
    .locals 0

    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗ᩶᩻;->֫:Ll/۫ܽܽ;

    iput-object p2, p0, Ll/ۗ᩶᩻;->ۧ:Ll/۟ۡۡ;

    return-void
.end method


# virtual methods
.method public final getInputStream()Ljava/io/InputStream;
    .locals 1

    .line 105
    iget-object v0, p0, Ll/ۗ᩶᩻;->ۧ:Ll/۟ۡۡ;

    invoke-virtual {v0}, Ll/۟ۡۡ;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public final length()J
    .locals 2

    .line 110
    iget-object v0, p0, Ll/ۗ᩶᩻;->ۧ:Ll/۟ۡۡ;

    invoke-virtual {v0}, Ll/۟ۡۡ;->length()J

    move-result-wide v0

    return-wide v0
.end method

.method public final synthetic ֫()Ljava/io/InputStream;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/֫ܺۡ;->֫(Ll/ۧܺۡ;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()Ll/۫ܽܽ;
    .locals 1

    .line 100
    iget-object v0, p0, Ll/ۗ᩶᩻;->֫:Ll/۫ܽܽ;

    return-object v0
.end method
