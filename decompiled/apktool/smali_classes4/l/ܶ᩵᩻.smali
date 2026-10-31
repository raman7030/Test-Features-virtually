.class public final Ll/ܶ᩵᩻;
.super Ljava/lang/Object;
.source "R8AK"


# instance fields
.field public final ֫:Ll/۫ᩴ᩻;

.field public final ۧ:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Ll/۫ᩴ᩻;)V
    .locals 0

    .line 1071
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1072
    iput-object p1, p0, Ll/ܶ᩵᩻;->ۧ:Ljava/io/InputStream;

    .line 1073
    iput-object p2, p0, Ll/ܶ᩵᩻;->֫:Ll/۫ᩴ᩻;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 1087
    iget-object v0, p0, Ll/ܶ᩵᩻;->֫:Ll/۫ᩴ᩻;

    invoke-virtual {v0}, Ll/۫ᩴ᩻;->run()V

    return-void
.end method

.method public final ۧ()Ljava/io/InputStream;
    .locals 1

    .line 1080
    iget-object v0, p0, Ll/ܶ᩵᩻;->ۧ:Ljava/io/InputStream;

    return-object v0
.end method
