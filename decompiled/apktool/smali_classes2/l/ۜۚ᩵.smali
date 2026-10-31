.class public final Ll/ۜۚ᩵;
.super Ljava/net/URLStreamHandler;
.source "X598"


# static fields
.field public static final ۧ:Ll/֫᩻֨;


# instance fields
.field public ֫:Ll/ᩴۡ᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 40
    const-class v0, Ll/ۜۚ᩵;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ۜۚ᩵;->ۧ:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/net/URLStreamHandler;-><init>()V

    return-void
.end method

.method public constructor <init>(Ll/ᩴۡ᩵;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/net/URLStreamHandler;-><init>()V

    .line 55
    iput-object p1, p0, Ll/ۜۚ᩵;->֫:Ll/ᩴۡ᩵;

    return-void
.end method


# virtual methods
.method public final getDefaultPort()I
    .locals 1

    const/16 v0, 0x1bd

    return v0
.end method

.method public final openConnection(Ljava/net/URL;)Ljava/net/URLConnection;
    .locals 3

    .line 67
    sget-object v0, Ll/ۜۚ᩵;->ۧ:Ll/֫᩻֨;

    invoke-interface {v0}, Ll/֫᩻֨;->֫()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 68
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Opening file "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 70
    :cond_0
    new-instance v0, Ll/۬ۚ᩵;

    .line 78
    iget-object v1, p0, Ll/ۜۚ᩵;->֫:Ll/ᩴۡ᩵;

    if-nez v1, :cond_1

    .line 79
    invoke-static {}, Ll/ܿܺ᩵;->ۘ()Ll/ܿܺ᩵;

    move-result-object v1

    iput-object v1, p0, Ll/ۜۚ᩵;->֫:Ll/ᩴۡ᩵;

    .line 81
    :cond_1
    iget-object v1, p0, Ll/ۜۚ᩵;->֫:Ll/ᩴۡ᩵;

    .line 70
    invoke-direct {v0, p1, v1}, Ll/۬ۚ᩵;-><init>(Ljava/net/URL;Ll/ᩴۡ᩵;)V

    return-object v0
.end method

.method public final parseURL(Ljava/net/URL;Ljava/lang/String;II)V
    .locals 10

    .line 87
    invoke-virtual {p1}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v0

    const-string v1, "smb://"

    .line 91
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    add-int/lit8 p4, p4, 0x2

    const-string p2, "smb:////"

    goto :goto_0

    .line 94
    :cond_0
    invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "//"

    .line 95
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    add-int/lit8 p4, p4, 0x2

    .line 98
    :cond_1
    :goto_0
    invoke-super {p0, p1, p2, p3, p4}, Ljava/net/URLStreamHandler;->parseURL(Ljava/net/URL;Ljava/lang/String;II)V

    .line 99
    invoke-virtual {p1}, Ljava/net/URL;->getPath()Ljava/lang/String;

    move-result-object p2

    .line 100
    invoke-virtual {p1}, Ljava/net/URL;->getRef()Ljava/lang/String;

    move-result-object p3

    if-eqz p3, :cond_2

    .line 102
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p2, 0x23

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    :cond_2
    move-object v7, p2

    .line 104
    invoke-virtual {p1}, Ljava/net/URL;->getPort()I

    move-result p2

    const/4 p3, -0x1

    if-ne p2, p3, :cond_3

    const/16 p2, 0x1bd

    const/16 v4, 0x1bd

    goto :goto_1

    :cond_3
    move v4, p2

    .line 108
    :goto_1
    invoke-virtual {p1}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Ljava/net/URL;->getAuthority()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Ljava/net/URL;->getUserInfo()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Ljava/net/URL;->getQuery()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    const-string v2, "smb"

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v9}, Ljava/net/URLStreamHandler;->setURL(Ljava/net/URL;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
