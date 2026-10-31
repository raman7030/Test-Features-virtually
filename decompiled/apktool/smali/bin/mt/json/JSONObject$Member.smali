.class public Lbin/mt/json/JSONObject$Member;
.super Ljava/lang/Object;
.source "JSONObject.java"


# instance fields
.field public final name:Ljava/lang/String;

.field public final value:Lbin/mt/json/JSONValue;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lbin/mt/json/JSONValue;)V
    .locals 0

    .line 906
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 907
    iput-object p1, p0, Lbin/mt/json/JSONObject$Member;->name:Ljava/lang/String;

    .line 908
    iput-object p2, p0, Lbin/mt/json/JSONObject$Member;->value:Lbin/mt/json/JSONValue;

    return-void
.end method

.method public static synthetic access$000(Lbin/mt/json/JSONObject$Member;)Ljava/lang/String;
    .locals 0

    .line 901
    iget-object p0, p0, Lbin/mt/json/JSONObject$Member;->name:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$100(Lbin/mt/json/JSONObject$Member;)Lbin/mt/json/JSONValue;
    .locals 0

    .line 901
    iget-object p0, p0, Lbin/mt/json/JSONObject$Member;->value:Lbin/mt/json/JSONValue;

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    .line 955
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    .line 958
    :cond_2
    check-cast p1, Lbin/mt/json/JSONObject$Member;

    .line 959
    iget-object v2, p0, Lbin/mt/json/JSONObject$Member;->name:Ljava/lang/String;

    iget-object v3, p1, Lbin/mt/json/JSONObject$Member;->name:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lbin/mt/json/JSONObject$Member;->value:Lbin/mt/json/JSONValue;

    iget-object p1, p1, Lbin/mt/json/JSONObject$Member;->value:Lbin/mt/json/JSONValue;

    invoke-virtual {v2, p1}, Lbin/mt/json/JSONValue;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    return v0

    :cond_3
    return v1
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 917
    iget-object v0, p0, Lbin/mt/json/JSONObject$Member;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getValue()Lbin/mt/json/JSONValue;
    .locals 1

    .line 926
    iget-object v0, p0, Lbin/mt/json/JSONObject$Member;->value:Lbin/mt/json/JSONValue;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    const/16 v0, 0x1f

    .line 932
    iget-object v1, p0, Lbin/mt/json/JSONObject$Member;->name:Ljava/lang/String;

    .line 0
    invoke-static {v0, v0, v1}, Ll/ۧ۬֫;->֫(IILjava/lang/String;)I

    move-result v0

    .line 933
    iget-object v1, p0, Lbin/mt/json/JSONObject$Member;->value:Lbin/mt/json/JSONValue;

    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
