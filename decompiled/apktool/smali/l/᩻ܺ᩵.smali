.class public final Ll/᩻ܺ᩵;
.super Ljava/lang/Object;
.source "6A1V"


# static fields
.field public static final ۜ:Ljava/util/HashMap;


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:I

.field public ܳ:Ljava/lang/String;

.field public ܽ:I

.field public ܿ:Ljava/lang/String;

.field public ᩳ:Ljava/util/HashMap;

.field public ᩻:Ll/ۖܺ᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 39
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/᩻ܺ᩵;->ۜ:Ljava/util/HashMap;

    const-string v1, "srvsvc"

    const-string v2, "4b324fc8-1670-01d3-1278-5a47bf6ee188:3.0"

    .line 43
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "lsarpc"

    const-string v2, "12345778-1234-abcd-ef00-0123456789ab:0.0"

    .line 44
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "12345778-1234-abcd-ef00-0123456789ac:1.0"

    const-string v2, "samr"

    .line 45
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "netdfs"

    const-string v3, "4fc742e0-4a10-11cf-8273-00aa004ae673:3.0"

    .line 46
    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "netlogon"

    const-string v3, "12345678-1234-abcd-ef00-01234567cffb:1.0"

    .line 47
    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "wkssvc"

    const-string v3, "6BFFD098-A112-3610-9833-46C3F87E345A:1.0"

    .line 48
    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "12345778-1234-ABCD-EF00-0123456789AC:1.0"

    .line 49
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 64
    iput-object v0, p0, Ll/᩻ܺ᩵;->ᩳ:Ljava/util/HashMap;

    .line 66
    iput-object v0, p0, Ll/᩻ܺ᩵;->֫:Ljava/lang/String;

    .line 67
    iput-object v0, p0, Ll/᩻ܺ᩵;->᩻:Ll/ۖܺ᩵;

    .line 73
    iput-object p1, p0, Ll/᩻ܺ᩵;->ܿ:Ljava/lang/String;

    .line 74
    iput-object p2, p0, Ll/᩻ܺ᩵;->ܳ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 169
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/᩻ܺ᩵;->ܿ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩻ܺ᩵;->ܳ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩻ܺ᩵;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 170
    iget-object v1, p0, Ll/᩻ܺ᩵;->ᩳ:Ljava/util/HashMap;

    if-eqz v1, :cond_0

    .line 171
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    const-string v3, ","

    .line 0
    invoke-static {v0, v3}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 172
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v1, "]"

    .line 0
    invoke-static {v0, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    const-string v0, "endpoint"

    .line 159
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 160
    iget-object p1, p0, Ll/᩻ܺ᩵;->֫:Ljava/lang/String;

    return-object p1

    .line 161
    :cond_0
    iget-object v0, p0, Ll/᩻ܺ᩵;->ᩳ:Ljava/util/HashMap;

    if-eqz v0, :cond_1

    .line 162
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 106
    iget-object v0, p0, Ll/᩻ܺ᩵;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    const-string v0, "endpoint"

    .line 135
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 136
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩻ܺ᩵;->֫:Ljava/lang/String;

    .line 137
    sget-object p2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p1, p2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "\\pipe\\"

    .line 138
    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x6

    .line 139
    invoke-virtual {p1, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    sget-object p2, Ll/᩻ܺ᩵;->ۜ:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_0

    const/16 p2, 0x3a

    .line 142
    invoke-virtual {p1, p2}, Ljava/lang/String;->indexOf(I)I

    move-result p2

    add-int/lit8 v0, p2, 0x1

    const/16 v1, 0x2e

    .line 143
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->indexOf(II)I

    move-result v1

    .line 144
    new-instance v2, Ll/ۖܺ᩵;

    const/4 v3, 0x0

    invoke-virtual {p1, v3, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v2, p2}, Ll/ۖܺ᩵;-><init>(Ljava/lang/String;)V

    iput-object v2, p0, Ll/᩻ܺ᩵;->᩻:Ll/ۖܺ᩵;

    .line 145
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Ll/᩻ܺ᩵;->ۧ:I

    add-int/lit8 v1, v1, 0x1

    .line 146
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Ll/᩻ܺ᩵;->ܽ:I

    return-void

    .line 150
    :cond_0
    new-instance p1, Ll/ۢܺ᩵;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Bad endpoint: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Ll/᩻ܺ᩵;->֫:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 58
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 150
    throw p1

    .line 152
    :cond_1
    iget-object v0, p0, Ll/᩻ܺ᩵;->ᩳ:Ljava/util/HashMap;

    if-nez v0, :cond_2

    .line 153
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/᩻ܺ᩵;->ᩳ:Ljava/util/HashMap;

    .line 154
    :cond_2
    iget-object v0, p0, Ll/᩻ܺ᩵;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 122
    iget v0, p0, Ll/᩻ܺ᩵;->ۧ:I

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 130
    iget v0, p0, Ll/᩻ܺ᩵;->ܽ:I

    return v0
.end method

.method public final ܿ()Ll/ۖܺ᩵;
    .locals 1

    .line 114
    iget-object v0, p0, Ll/᩻ܺ᩵;->᩻:Ll/ۖܺ᩵;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 98
    iget-object v0, p0, Ll/᩻ܺ᩵;->ܳ:Ljava/lang/String;

    return-object v0
.end method
